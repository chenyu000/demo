package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        System.out.println("我是张三");
        System.out.println("我是李四");
        System.out.println("我是张三pro");
    }

    public void test(String name){
        System.out.println("一百行代码");
    }

}
