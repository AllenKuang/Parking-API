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
        ArrayList<ParkingLot> parkingLots=new ArrayList<>();
        parkingLots.add(new ParkingLot(1,20));
        parkingBoys.add(new ParkingBoy(1,parkingLots));
    }

    public ArrayList<ParkingBoy> getParkingBoys() {
        return parkingBoys;
    }

    public void setParkingBoys(ArrayList<ParkingBoy> parkingBoys) {
        this.parkingBoys = parkingBoys;
    }

    public void addparkingBoy(ParkingBoy parkingBoy) {
        this.parkingBoys.add(parkingBoy);
    }



    public void addParkingLot(long boyId,ParkingLot parkingLot) {
        for(ParkingBoy tempParkingBoy:this.getParkingBoys()){
            if(tempParkingBoy.getParkingBoyId()==boyId) {
                tempParkingBoy.getParkingLots().add(parkingLot);
                //return tempParkingBoy;
            }
        }
        //return null;
        //this.boysParkingLots.add();
    }

    public ArrayList<ParkingBoy> deleteParkingBoyById(int boyId) {
        for(int i=0;i<this.getParkingBoys().size();i++){
            if(this.getParkingBoys().get(i).getParkingBoyId()==boyId){
                this.getParkingBoys().remove(i);
                return this.getParkingBoys();
            }
        }
        return null;
    }

}
