package com.example.lzdemo2.controller;

import com.example.lzdemo2.entity.Response;
import com.example.lzdemo2.entity.Trade;
import com.example.lzdemo2.entity.orderid;
import com.example.lzdemo2.entity.Trade;
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

//    @RequestMapping("/test3")
//    public List<trade> gettrade(){
//        return tradeService.findAll();
//
//    }

    @RequestMapping("/select")
    public List<Trade> getorderid(){
        return  tradeService.select();
//        return orderidService.findOrderid();

    }
    @RequestMapping("/insert")
    public void insert(Trade trade){
         tradeService.InsertTrade(trade);

    }

    @RequestMapping("/insert3")
    public Response insert3(Trade trade1){
        try {
            tradeService.Insert(trade1);
        }
        catch (Exception e)
        {
            Response response = new Response();
            response.setCode(1);
            response.setErrno(1);
            response.setMsg(e.toString());
            return response;
        }
        Response response = new Response();
        response.setCode(0);
        response.setErrno(0);
        response.setMsg("success");
        return response;


    }
    @RequestMapping("/insert2")
    public void insert2(Integer ID,String orderID){

//            tradeService.InserbyId2(ID, orderID);

    }
    @RequestMapping("/delete")
    public void delete(Integer ID){
        tradeService.DeletebyID(ID);

    }
    @RequestMapping("/delete2")
    public void delete2(Integer ID){
//        tradeService.DeletebyID2(ID);

    }
}
