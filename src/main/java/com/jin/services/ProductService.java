package com.jin.services;

import com.jin.entities.Product;
import com.jin.entities.repositories.ProductRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public List<Product> listAll() {
        return ProductRepository.getInstance().findAll();
    }

    public Product getById(Integer id) {
        return ProductRepository.getInstance().findById(id);
    }
}
