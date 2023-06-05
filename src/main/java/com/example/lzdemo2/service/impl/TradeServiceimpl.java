package com.example.lzdemo2.service.impl;

import com.example.lzdemo2.entity.trade;
import com.example.lzdemo2.mapper.Trademapper;
import com.example.lzdemo2.service.TradeService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeServiceimpl implements TradeService {
    @Autowired
    private Trademapper trademapper;

    @Override
    public List<trade> findAll(){
        return trademapper.findall();


    }
    @Override
    public void InserbyId(Integer ID){
        trademapper.insertbyid(ID);


    }
    @Override
    public void InserbyId2(Integer ID, String orderId){
        trademapper.insertbyid2(ID,orderId);


    }
    @Override
    public void DeletebyID(Integer ID){
        trademapper.deletebyid(ID);


    }
    @Override
    public void DeletebyID2(Integer ID){
        trademapper.deletebyid2(ID);


    }
}
