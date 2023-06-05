package com.example.lzdemo2.service;

import com.example.lzdemo2.entity.orderid;
import com.example.lzdemo2.mapper.OrderIdmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrderidService {
     default List<orderid> findOrderid() {
        return null;
    }


}
