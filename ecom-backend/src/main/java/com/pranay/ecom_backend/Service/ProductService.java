package com.pranay.ecom_backend.Service;


import com.pranay.ecom_backend.Model.Product;
import com.pranay.ecom_backend.Repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    private ProductRepo repo;

    public ProductService(ProductRepo repo) {
        this.repo = repo;
    }


    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getOneProduct(int id) {
        return repo.findById(id).orElse(null);
    }


}