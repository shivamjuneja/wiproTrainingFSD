package com.trainingapps.productms.controller;

import com.trainingapps.productms.entity.Product;
import com.trainingapps.productms.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private IProductService service;

    @GetMapping("/getproduct")
    public ModelAndView getProduct() {
        return new ModelAndView("getproduct");
    }

    @GetMapping("/productdetails")
    public ModelAndView productDetails(@RequestParam long id) throws Exception {
        Product product = service.findById(id);
        ModelAndView mv = new ModelAndView("productprofile", "product", product);
        return mv;
    }

    @GetMapping("/processaddproduct")
    public RedirectView addProduct(@RequestParam String name, @RequestParam int price) {
        Product product = service.addProduct(name, price);
        String url = "/productdetails?id=" + product.getId();
        RedirectView redirect = new RedirectView(url);
        return redirect;
    }

    @GetMapping("/addproduct")
    public ModelAndView getAddProductPage() {
        return new ModelAndView("addproduct");
    }

    @GetMapping("/listproducts")
    public ModelAndView getProductList() {
        List<Product> products = service.findAll();
        ModelAndView modelAndView = new ModelAndView("listproducts", "products", products);
        return modelAndView;
    }


}
