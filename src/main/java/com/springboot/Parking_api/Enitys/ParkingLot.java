package com.springboot.Parking_api.Enitys;

import org.springframework.stereotype.Component;


public class ParkingLot {
    private long parkingLotId;

    public ParkingLot(){

    }
    public ParkingLot(ParkingLot parkingLot){
        this.parkingLotId=parkingLot.getParkingLotId();
    }
    public long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
}
