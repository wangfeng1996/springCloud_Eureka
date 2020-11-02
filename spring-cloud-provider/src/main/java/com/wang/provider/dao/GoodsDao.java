package com.wang.provider.dao;


import com.wang.provider.domain.Goods;
import org.springframework.stereotype.Repository;


/**
 * 商品Dao
 * @author 一只永不言弃的小乌龟
 */

@Repository
public class GoodsDao {


    public Goods findOne(int id){
        return new Goods(1,"华为手机",3999,10000);
    }
}
