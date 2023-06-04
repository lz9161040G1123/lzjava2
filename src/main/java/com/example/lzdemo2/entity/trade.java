package com.example.lzdemo2.entity;

public class trade {
    private int ID;
    private String order_id;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public trade(int ID, String order_id) {
        this.ID = ID;
        this.order_id = order_id;
    }
}
