package com.example.lzdemo2.service;

import com.example.lzdemo2.entity.Trade;
import com.example.lzdemo2.entity.Trade;

import com.example.lzdemo2.entity.TradeExample;
import com.example.lzdemo2.mapper.TradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class TradeService {

//     default List<trade> findAll() {
//        return null;
//    }

    @Autowired
    private TradeMapper tradeMapper;

     public void InsertTrade(Trade trade) {
//         Trade trade = new Trade();
//         trade.setId(111111);
//         trade.setOrderId("qqqqqqqq");
         int L = tradeMapper.insert(trade);
         System.out.println(L);

    }
    public List<Trade> select( ) {

        TradeExample tradeExample = new TradeExample();
        tradeExample.createCriteria().andIdIsNotNull();
        List<Trade> L = tradeMapper.selectByExample(tradeExample);
        return L;
//        tradeMapper.insert(trade);

    }

     void InserbyId2(Integer ID, String orderId){


    }
     public void DeletebyID(Integer ID){
         TradeExample tradeExample = new TradeExample();
         tradeExample.createCriteria().andIdIsNotNull().andIdEqualTo(ID);
        int a =  tradeMapper.deleteByExample(tradeExample);
        System.out.println(a);



    }
     void DeletebyID2(Integer ID){
    }

       public void Insert(Trade trade1) throws Exception {
    }

}
