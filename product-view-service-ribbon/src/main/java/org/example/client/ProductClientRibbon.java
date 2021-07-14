package org.example.client;

import java.util.List;

import org.example.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//这里也是一个bean 可以自动导入
@Component
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;

	public List<Product> listProdcuts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }

}
