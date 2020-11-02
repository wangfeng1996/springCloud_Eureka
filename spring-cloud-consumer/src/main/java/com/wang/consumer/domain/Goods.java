package com.wang.consumer.domain;

/**
 * 商品实体类
 * @author 一只永不言弃的小乌龟
 */
public class Goods {
    /**
     * id: 商品的id
     * title:商品的名称
     * price:商品的价格
     * count: 商品的库存
     */

    private int id;
    private String title;
    private double price;
    private int count;

    public Goods() {
    }

    public Goods(int id, String title, double price, int count) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
