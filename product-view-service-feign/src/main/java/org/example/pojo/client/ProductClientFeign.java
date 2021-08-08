package org.example.pojo.client;
 
import java.util.List;

import org.example.pojo.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
 

@FeignClient(value = "PRODUCT-DATA-SERVICE",fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {
 
    @GetMapping("/products")
    public List<Product> listProdcuts();
}