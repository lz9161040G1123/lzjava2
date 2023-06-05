package com.example.lzdemo2.service;

import com.example.lzdemo2.entity.trade;

import org.springframework.stereotype.Service;

import java.util.List;

public  interface TradeService {

    public default List<trade> findAll() {
        return null;
    }

    public default void InserbyId(Integer ID) {

    }

    public default void InserbyId2(Integer ID, String orderId){


    }
    public default void DeletebyID(Integer ID){


    }
    public default void DeletebyID2(Integer ID){
    }

}
