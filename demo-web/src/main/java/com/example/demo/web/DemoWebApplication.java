package com.example.demo.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: demo
 * @description: spring boot 启动类
 * @author: ssc
 * @create: 2019/8/18
 **/
@SpringBootApplication(scanBasePackages = "com.example.demo")
@MapperScan("com.example.demo.dao.mapper")
public class DemoWebApplication {
    public static void main(String[] args){
        SpringApplication.run(DemoWebApplication.class, args);
    }
}
