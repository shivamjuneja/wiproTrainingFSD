package com.example.productms.frontend;

import com.example.productms.entity.Product;
import com.example.productms.exceptions.InvalidPriceException;
import com.example.productms.exceptions.InvalidProductIdException;
import com.example.productms.exceptions.InvalidProductNameException;
import com.example.productms.exceptions.ProductNotFoundException;
import com.example.productms.service.IProductService;
import com.example.productms.service.ProductServiceImpl;

public class FrontEnd {
    private IProductService service = new ProductServiceImpl();

    public void runUI() {
        try {
            System.out.println("*** add products");
            Product product1 = service.addProduct("samsung", 10000);
            display(product1);
            Product product2 = service.addProduct("motorolla", 10000);
            display(product2);
            long product1Id = product1.getId();
            System.out.println("***find product by id="+product1Id);
            Product foundProduct = service.findById(product1Id);
            display(foundProduct);
            System.out.println("***change product price");
            Product updated = service.changePrice(product1Id, 25000);
            display(updated);

            System.out.println("displaying all products");

            Product products[]=service.findAll();
            display(products);
        } catch (InvalidProductNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidProductIdException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());

        }

    }

    void display(Product product) {
        System.out.println(product.getId() + " ," + product.getName() + " ," + product.getPrice());
    }

    void display(Product products[]){
        for(Product product:products){
            if(product!=null){
                display(product);
            }
        }
    }

}
