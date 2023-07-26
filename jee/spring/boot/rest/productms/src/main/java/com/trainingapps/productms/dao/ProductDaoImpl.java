package com.trainingapps.productms.dao;

import com.trainingapps.productms.entity.Product;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ProductDaoImpl implements IProductDao {
    private Map<Long,Product> store = new HashMap<>();

    private int generatedId;

    private int generateId() {
        return ++generatedId;
    }

    @Override
    public void add(Product product) {
        long newId = generateId();
        product.setId(newId);
        store.put(newId,product);
    }

    @Override
    public Product findById(long id) {
      Product product=store.get(id);
      return product;
    }

    @Override
    public void update(Product product) {
        store.put(product.getId(),product);
    }

    @Override
    public List<Product> findAll() {
        Collection<Product> values= store.values();
        List<Product>desired=new ArrayList<>(values);
        return desired;
    }

    @Override
    public void remove(Product product){
       store.remove(product.getId());
    }


}
