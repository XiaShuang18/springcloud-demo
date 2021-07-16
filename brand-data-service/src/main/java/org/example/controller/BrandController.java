package org.example.controller;

import org.example.pojo.Brand;
import org.example.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class BrandController {
    @Autowired
    private BrandService brandService;

    @RequestMapping("/listBrand")
    public List<Brand> listAll() {
        List<Brand> brands = brandService.listAll();
        return brands;
    }
}
