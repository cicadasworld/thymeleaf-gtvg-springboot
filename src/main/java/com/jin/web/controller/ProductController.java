package com.jin.web.controller;

import com.jin.entities.Product;
import com.jin.services.ProductService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("product/list")
    public String listAll(Model model) {
        List<Product> allProducts = productService.listAll();
        model.addAttribute("prods", allProducts);
        return "product/list";
    }

    @GetMapping("product/comments")
    public String getById(@RequestParam int prodId, Model model) {
        Product product = productService.getById(prodId);
        model.addAttribute("prod", product);
        return "product/comments";
    }
}
