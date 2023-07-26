package com.trainingapps.productms.service;

import com.trainingapps.productms.dao.IProductDao;
import com.trainingapps.productms.entity.Product;
import com.trainingapps.productms.exceptions.ProductNotFoundException;
import com.trainingapps.productms.util.ProductUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProductServiceImplTest {

    @Mock
    IProductDao dao;
    @Mock
    ProductUtil util;

    @Spy
    @InjectMocks
    ProductServiceImpl service;

    /**
     * scenario: product is found
     * input : id=10
     * expectation: product fetched from store
     */
    @Test
    public void testFindById_1() throws Exception{
        int id=10;
        Product product=mock(Product.class);
        when(dao.findById(id)).thenReturn(product);
        Product result=service.findById(id);
        assertEquals(product,result);
        verify(dao).findById(id);
    }

    /**
     * scenario: product is not found in the store
     * input : id=10
     * expectation: ProductNotFoundException is thrown
     */
    @Test
    public void testFindById_2() throws Exception{
        int id=20;
       /*
        Executable executable=new Executable(){
            @Override
            public void execute() throws Throwable {
                service.findById(id);

            }
        };
        */
        Executable executable=()->service.findById(id);
        assertThrows(ProductNotFoundException.class,executable);
        verify(dao).findById(id);
    }

}
