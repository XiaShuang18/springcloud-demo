package org.example;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class BrandDataServiceApplication {

    public static void main(String[] args) {
//启动这个微服务

    }
}
