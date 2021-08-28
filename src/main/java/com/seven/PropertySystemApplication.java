package com.seven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.seven.mapper")
public class PropertySystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropertySystemApplication.class, args);
    }

}
