package com.example.demooo.controller;
import com.example.demooo.entity.Products;
import com.example.demooo.services.ProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class ProductsController {

    @Autowired
    private ProductsServices ProductsServices;
    @PostMapping("/Products/addProducts")
    public @ResponseBody Products addProducts (@RequestBody Products P)
    {
        return ProductsServices.addProducts(P);
    }

    @GetMapping("/Products/getAll")
    public @ResponseBody ArrayList<Products> getAll()
    {
        return ProductsServices.getAll();
    }

    @GetMapping("/Products/findProductsId/{id}")
    public @ResponseBody Optional<Products> findProductsById(@PathVariable Long id)
    {
        return ProductsServices.findProductsById(id);
    }
}




