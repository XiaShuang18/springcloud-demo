package org.example.pojo.service;

import java.util.List;

import org.example.pojo.pojo.Product;
import org.example.pojo.client.ProductClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;

    public List<Product> listProducts() {
        return productClientFeign.listProdcuts();

    }
}
