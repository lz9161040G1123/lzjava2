package com.example.lzdemo2.service.impl;

import com.example.lzdemo2.entity.orderid;
import com.example.lzdemo2.mapper.OrderIdmapper;
import com.example.lzdemo2.service.OrderidService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Orderidserviceimpl implements OrderidService {

    @Autowired
    public OrderIdmapper orderIdmapper;

    @Override
    public List<orderid> findOrderid() {
        return orderIdmapper.findorderid();
    }




}
