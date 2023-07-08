package com.apisimple.demo.controller;

import com.apisimple.demo.entities.Department;
import com.apisimple.demo.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping()
    public List<Product> getObjects() {
        Department d1 = new Department(1L, "Tech");
        Department d2 = new Department(2L, "Pet");

        Product p1 = new Product(1L, "Mackbook Pro", 4000.0, d1);
        Product p2 = new Product(1L, "Mackbook Pro", 4000.0, d1);
        Product p3 = new Product(1L, "Mackbook Pro", 4000.0, d2);

        List<Product> list = Arrays.asList(p1, p2, p3);

        return list;
    }
}
