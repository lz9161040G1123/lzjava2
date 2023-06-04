package com.example.lzdemo2.service;

import com.example.lzdemo2.entity.trade;
import com.example.lzdemo2.mapper.Trademapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeService {
    @Autowired
    private Trademapper trademapper;

    public List<trade> findAll(){
        return trademapper.findall();


    }
    public void InserbyId(Integer ID){
         trademapper.insertbyid(ID);


    }
    public void InserbyId2(Integer ID, String orderId){
        trademapper.insertbyid2(ID,orderId);


    }
    public void DeletebyID(Integer ID){
        trademapper.deletebyid(ID);


    }
    public void DeletebyID2(Integer ID){
        trademapper.deletebyid2(ID);


    }
}
