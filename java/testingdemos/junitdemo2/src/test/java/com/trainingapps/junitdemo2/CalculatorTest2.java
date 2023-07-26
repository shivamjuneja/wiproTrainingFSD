package com.trainingapps.junitdemo2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class CalculatorTest2 {
    @Mock
    Adder adder;

    @Spy
    @InjectMocks
    Calculator calculator;


    /**
     * scenario: positive number
     * input : 5
     * expectation:15
     */
    @Test
    public void testAddBy10_1() {
        int num = 5;
        int expected = 15;
        when(adder.add(num,10)).thenReturn(15);
        int result = calculator.addBy10(num);
        assertEquals(expected, result);
        verify(adder).add(num,10);
    }

    /**
     * scenario: negative number
     * input : -7
     * expectation: 3
     */
    @Test
    public void testAddBy10_2() {
        int num = -7;
        int expected = 3;
        when(adder.add(num,10)).thenReturn(3);
        int result = calculator.addBy10(num);
        assertEquals(expected, result);
        verify(adder).add(num,10);

    }


    @Test
    public void testMultiplyBy10_1(){
        int num=5;
        int expected=50;
        doReturn(50).when(calculator).multiply(num,10);
        int result= calculator.multiplyBy10(5);
        assertEquals(expected,result);
        verify(calculator).multiply(num,10);
    }

}