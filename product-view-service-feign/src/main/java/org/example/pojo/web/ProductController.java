package org.example.pojo.web;
import java.util.List;

import org.example.pojo.pojo.Product;
import org.example.pojo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductController {
 
	@Autowired
    ProductService productService;
	
    @RequestMapping("/products")
    public Object products(Model m) {
    	List<Product> ps = productService.listProducts();
    	m.addAttribute("my_products", ps);
        return "products";
    }
}
