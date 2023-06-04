package com.example.lzdemo2.service;

import com.example.lzdemo2.entity.orderid;
import com.example.lzdemo2.mapper.OrderIdmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderidService {
    @Autowired
    private OrderIdmapper orderIdmapper;
    public List<orderid> findOrderid()
    {
        return  orderIdmapper.findorderid();
    }

}
