package com.marv.SpringEcom.Controller;

import com.marv.SpringEcom.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        return "All Products";
    }
}
