package com.trainingapps.junitdemo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest1 {
    Calculator spy;
    Adder adder;

    @BeforeEach
    public void setUp() {
        adder =mock(Adder.class);
        Calculator calculator = new Calculator(adder);
        spy=spy(calculator);
    }


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
        int result = spy.addBy10(num);
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
        int result = spy.addBy10(num);
        assertEquals(expected, result);
        verify(adder).add(num,10);

    }


    @Test
    public void testMultiplyBy10_1(){
        int num=5;
        int expected=50;
        doReturn(50).when(spy).multiply(num,10);
        int result= spy.multiplyBy10(5);
        assertEquals(expected,result);
        verify(spy).multiply(num,10);
    }

}