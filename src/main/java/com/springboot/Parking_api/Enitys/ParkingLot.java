package com.springboot.Parking_api.Enitys;

import org.springframework.stereotype.Component;


public class ParkingLot {
    private int parkingLotId;
    private int size;
    public ParkingLot(){

    }
    public ParkingLot(int parkingLotId,int size){
        this.parkingLotId=parkingLotId;
        this.size=size;
    }
    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
