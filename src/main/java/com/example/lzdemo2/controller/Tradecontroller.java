package com.example.lzdemo2.controller;

import com.example.lzdemo2.entity.orderid;
import com.example.lzdemo2.entity.trade;
import com.example.lzdemo2.mapper.OrderIdmapper;
import com.example.lzdemo2.service.OrderidService;
import com.example.lzdemo2.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Tradecontroller {

    @Autowired
    private TradeService tradeService;
    @Autowired
    private OrderidService orderidService;



    @RequestMapping("/test2")
    public Animal getname(){
        return new Animal("dog", 10);
    }

    @RequestMapping("/test3")
    public List<trade> gettrade(){
        return tradeService.findAll();

    }

    @RequestMapping("/test5")
    public List<orderid> getorderid(){
        return orderidService.findOrderid();

    }
    @RequestMapping("/insert")
    public void insert(Integer ID){
         tradeService.InserbyId(ID);

    }
    @RequestMapping("/insert2")
    public void insert2(Integer ID,String orderID){
        tradeService.InserbyId2(ID,orderID);

    }
    @RequestMapping("/delete")
    public void delete(Integer ID){
        tradeService.DeletebyID(ID);

    }
    @RequestMapping("/delete2")
    public void delete2(Integer ID){
        tradeService.DeletebyID2(ID);

    }
}
