package com.wang.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 一只永不言弃的小乌龟
 * @create 2020/11/2 12:38 下午
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class, args);
    }


}
