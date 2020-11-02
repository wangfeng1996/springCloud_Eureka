package com.wang.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 一只永不言弃的小乌龟
 * @create 2020/11/2 3:04 下午
 * @EnableEurekaServer // 表示的是开启Eureka的服务器端功能
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApp {
    public static void main(String[] args) {
        SpringApplication.run(ServerApp.class, args);
    }
}
