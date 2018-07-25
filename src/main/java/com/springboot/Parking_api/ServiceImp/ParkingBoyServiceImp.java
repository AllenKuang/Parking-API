package com.springboot.Parking_api.ServiceImp;

import com.springboot.Parking_api.Enitys.ParkingBoy;
import com.springboot.Parking_api.Enitys.ParkingLot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ParkingBoyServiceImp {
    private ArrayList<ParkingBoy> parkingBoys;//=new ArrayList<>();
    //private HashMap<ParkingBoy,ParkingLot> boys

    public ParkingBoyServiceImp(){
        this.parkingBoys=new ArrayList<>();
    }

    public ArrayList<ParkingBoy> getParkingBoys() {
        return parkingBoys;
    }

    public void setParkingBoys(ArrayList<ParkingBoy> parkingBoys) {
        this.parkingBoys = parkingBoys;
    }

    public ParkingBoy addparkingBoy(ParkingBoy parkingBoy) {
        this.parkingBoys.add(parkingBoy);
        return parkingBoy;
    }



    public ParkingBoy addParkingLot(long boyId,ParkingLot parkingLot) {
        for(ParkingBoy tempParkingBoy:this.getParkingBoys()){
            if(tempParkingBoy.getParkingBoyId()==boyId) {
                tempParkingBoy.getParkingLots().add(parkingLot);
                return tempParkingBoy;
            }
        }
        return null;
        //this.boysParkingLots.add();
    }
}
