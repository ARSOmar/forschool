package com.example.demooo.services;
import com.example.demooo.entity.Products;
import com.example.demooo.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductsServices {
    @Autowired
    private ProductsRepository repository;

    public Products addProducts(Products P)
    {

        System.out.println(P);
        return repository.save(P);
    }
    public ArrayList<Products> getAll()
    {
        return (ArrayList<Products>) repository.findAll();
    }
    public Optional<Products> findProductsById(Long id)
    {
        return repository.findById(id);
    }

  /*  public Products updateProductsInfo(Products P,Long id)
    {
        Optional<Products> P1 = repository.findById(id);
        P1.get().setname(P.getname());
        P1.get().setprice(P.getprice());
        P1.get().setid(P.getid());
        P1.get().setdescription(P.getdescription());
        return repository.save(P1);
    }*/
}






