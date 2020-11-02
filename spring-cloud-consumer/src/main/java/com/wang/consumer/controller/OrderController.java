package com.wang.consumer.controller;


import com.wang.consumer.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * 服务的调用方
 *
 * @author 一只永不言弃的小乌龟
 */

@RestController
@RequestMapping("/order")
public class OrderController {
    /**
     * 注入RestTemplate bean
     */
    @Autowired
    private RestTemplate restTemplate;
    /**
     * 注入discoverClient  发现客户端  从注册中心获取服务的名称
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/goods/{id}")
    public Goods findGoodsById(@PathVariable("id") int id) {
//        获取实例对象(集合中不至一个实例对象)
        List<ServiceInstance> instances = discoveryClient.getInstances("spring-cloud-provider");
//        判断实例是否为空
        if (instances == null || instances.size() == 0) {
            return null;
        }
//        获取第一个实例对象
        ServiceInstance instance = instances.get(0);
//        获取主机地址
        String host = instance.getHost();
//        获取端口号
        int port = instance.getPort();
//        拼接成url
        String url = "http://" + host + ":" + port + "/goods/findOne/" + id;
//       调用生产者的接口
        Goods goods = restTemplate.getForObject(url, Goods.class, "");

        return goods;
    }
}
