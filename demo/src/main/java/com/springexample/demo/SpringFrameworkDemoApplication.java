package com.springexample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringFrameworkDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFrameworkDemoApplication.class, args);
		System.out.println("Hello World");
    }

}
