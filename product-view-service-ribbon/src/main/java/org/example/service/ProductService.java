package org.example.service;

import java.util.List;

import org.example.client.ProductClientRibbon;
import org.example.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//一个bean
@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> listProducts() {
        return productClientRibbon.listProdcuts();

    }
}