package com.springboot.Parking_api.Enitys;

import java.util.ArrayList;

public class ParkingBoy {
    private int parkingBoyId;
    private ArrayList<ParkingLot> parkingLots;
    public ParkingBoy(){

    }
//    public ParkingBoy(ParkingBoy parkingBoy){
//        this.parkingBoyId=parkingBoy.getParkingBoyId();
//        this.parkingLots =new ArrayList<>();
//    }
    public ParkingBoy(int parkingBoyId,ArrayList<ParkingLot> parkingLots){
        this.parkingBoyId=parkingBoyId;
        this.parkingLots=parkingLots;
    }
    public int getParkingBoyId() {
        return parkingBoyId;
    }

    public void setParkingBoyId(int parkingBoyId) {
        this.parkingBoyId = parkingBoyId;
    }

    public ArrayList<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(ArrayList<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }
}
