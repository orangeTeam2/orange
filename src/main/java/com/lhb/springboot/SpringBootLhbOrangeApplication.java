package com.lhb.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lhb.springboot.mapper")
@SpringBootApplication
public class SpringBootLhbOrangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLhbOrangeApplication.class, args);
    }

}
