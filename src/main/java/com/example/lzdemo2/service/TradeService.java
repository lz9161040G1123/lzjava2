package com.example.lzdemo2.service;

import com.example.lzdemo2.entity.trade;

import org.springframework.stereotype.Service;

import java.util.List;

public  interface TradeService {

     default List<trade> findAll() {
        return null;
    }

     default void InserbyId(Integer ID) {

    }

     default void InserbyId2(Integer ID, String orderId){


    }
     default void DeletebyID(Integer ID){


    }
     default void DeletebyID2(Integer ID){
    }

      default void Insert(trade trade1) throws Exception {
    }

}
