package com.pranay.ecom_backend.Service;


import com.pranay.ecom_backend.Model.Product;
import com.pranay.ecom_backend.Repository.ProductRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        return repo.save(product);
    }

    public Product updateProductById(int id, Product product, MultipartFile imageFile) throws IOException{
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        if(product.getId() == id){
            return repo.save(product);
        }
        return null;
    }

    public void deleteProductById(int id) {
        repo.deleteById(id);
    }
}