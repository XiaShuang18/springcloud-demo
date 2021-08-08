package org.example.pojo.client;

import org.example.pojo.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductClientFeignHystrix implements ProductClientFeign{
    @Override
    public List<Product> listProdcuts() {
        ArrayList<Product> result = new ArrayList<>();
        result.add(new Product(0,"产品微服务不可用",0));
        return result;
    }
}
