package org.example.service;

import org.example.pojo.Brand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandService {
    @Value("${server.port}")
    String port;

    public List<Brand> listAll(){
        ArrayList<Brand> brandArrayList = new ArrayList<>();
        brandArrayList.add(new Brand(1, "LVD", "这是LVD"));
        brandArrayList.add(new Brand(2, "GUCCU", "这是GUCCU哈哈哈"));
        brandArrayList.add(new Brand(1, "Spring", "这是SpringMIVC"));

        return brandArrayList;
    }

}
