package com.example.lzdemo2.mapper;

import com.example.lzdemo2.entity.orderid;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderIdmapper {
    List<orderid>findorderid();

}
