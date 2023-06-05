package com.example.lzdemo2.mapper;

import com.example.lzdemo2.entity.trade;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Trademapper {
    List<trade> findall();
    void insertbyid(Integer ID);
    void insertbyid2(@Param("ID") Integer ID,@Param("order_id") String orderId);

    void deletebyid(Integer ID);
    void deletebyid2(@Param("customerid") Integer ID);
    void insert(trade trade1);
}
