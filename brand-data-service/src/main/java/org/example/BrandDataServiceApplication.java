package org.example;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class BrandDataServiceApplication {

    public static void main(String[] args) {
//启动这个微服务
        int port = 8090;
        System.out.println("品牌默认是8090端口");
//        下一步考虑使用异步任务的方式 改进这个启动的方式

        new SpringApplicationBuilder(BrandDataServiceApplication.class).properties("server.port=" + port).run(args);
//        new SpringApplicationBuilder(BrandDataServiceApplication.class).properties("server.port=" + port).run(args);
    }
}
