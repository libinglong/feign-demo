package com.example.feigndemo;

import com.example.feigndemo.feignclient.Baidu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeignDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FeignDemoApplication.class, args);
    }

    @Autowired
    private Baidu baidu;

    @Override
    public void run(String... args) throws Exception {
        String content = baidu.content();
        System.out.println(content);
    }
}
