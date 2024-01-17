package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.Product;



public interface ProductService {
    public Product save(Product product);
    public Product findByIdProduct(Long id);
    public List<Product> findAllProduct();
    public void deleteProduct(Long id);
}
