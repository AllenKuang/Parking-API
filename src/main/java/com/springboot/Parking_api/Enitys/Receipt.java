package com.springboot.Parking_api.Enitys;

import java.util.UUID;

public class Receipt {
    private String receiptId;

    public Receipt(){
    }
    public Receipt(String receiptId){
        this.receiptId=receiptId;
        //setReceiptId();
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId( ) {
        //this.receiptId = UUID.randomUUID().toString();
    }
}
