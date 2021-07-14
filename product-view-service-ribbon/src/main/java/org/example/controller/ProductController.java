package org.example.controller;
import java.util.List;

import org.example.pojo.Product;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 不再是RestController
@Controller
public class ProductController {
// 导入service IOC
	@Autowired
    ProductService productService;
	
    @RequestMapping("/products")
    public Object products(Model m) {
    	List<Product> ps = productService.listProducts();
    	m.addAttribute("ps", ps);
        return "products";
    }
}
