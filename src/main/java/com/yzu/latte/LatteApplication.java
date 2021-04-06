package com.yzu.latte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.yzu.latte.domain.repository")
public class LatteApplication {
    public static void main(String[] args) {
        SpringApplication.run(LatteApplication.class, args);
    }

}