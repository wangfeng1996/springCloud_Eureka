package com.wang.consumer.controller;


import com.wang.consumer.domain.Goods;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;


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

    @GetMapping("/goods/{id}")
    public Goods findGoodsById(@PathVariable("id") int id) {
/**
 * 指定你要访问的地址,这个地址是服务的生产者的地址,端口号和地址都不能搞错
 *
 *   远程调用Goods服务中的findOne接口
 */
        String url = "http://localhost:9000/goods/findOne/" + id;


        ResponseEntity<Goods> forEntity = restTemplate.getForEntity(url, Goods.class, "");

        Goods body = forEntity.getBody();

        return body;





    }
}
