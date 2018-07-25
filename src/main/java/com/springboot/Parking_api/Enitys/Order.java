package com.springboot.Parking_api.Enitys;

public class Order {
    private int orderId;
    private String receiptId;
    private int parkingBoyId;
    private boolean status;

    public Order(){

    }
    public Order(int orderId,String receiptId,int parkingBoyId,boolean status){
        this.orderId=orderId;
        this.receiptId=receiptId;
        this.parkingBoyId=parkingBoyId;
        this.status=status;
    }
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public int getParkingBoyId() {
        return parkingBoyId;
    }

    public void setParkingBoyId(int parkingBoyId) {
        this.parkingBoyId = parkingBoyId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
