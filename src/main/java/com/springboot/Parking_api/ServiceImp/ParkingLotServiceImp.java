package com.springboot.Parking_api.ServiceImp;

import com.springboot.Parking_api.Enitys.ParkingLot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ParkingLotServiceImp {
    private ArrayList<ParkingLot> parkingLots;

    public ParkingLotServiceImp(){
        this.parkingLots=new ArrayList<>();
        this.getParkingLots().add(new ParkingLot(1,20));
    }

    public ArrayList<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(ArrayList<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public ArrayList<ParkingLot> addParkingLot(ParkingLot parkingLot) {
        this.getParkingLots().add(parkingLot);
        return this.getParkingLots();
    }

    public ArrayList<ParkingLot> deleteParkingLotById(int parkingLotId) {
        for(int i=0;i<this.getParkingLots().size();i++){
            if(this.getParkingLots().get(i).getParkingLotId()==parkingLotId){
                this.getParkingLots().remove(i);
                return this.getParkingLots();
            }
        }
        return null;
    }
}
