package com.springboot.Parking_api.Controllers;

import com.springboot.Parking_api.Enitys.ParkingLot;
import com.springboot.Parking_api.ServiceImp.ParkingLotServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ParkingLotsController {
    @Autowired
    ParkingLotServiceImp parkingLotServiceImp;

    @GetMapping("/parkingLots")
    public ArrayList<ParkingLot> getparkingLots(){
        return parkingLotServiceImp.getParkingLots();
    }
    @PostMapping("/parkingLots")
    public ArrayList<ParkingLot> buildParkingLot(@RequestBody ParkingLot reqparkingLot){
        return parkingLotServiceImp.addParkingLot(reqparkingLot);

    }
    @DeleteMapping("/parkingLots/{parkingLotId}")
    public ArrayList<ParkingLot> deleteParkingLotById(@PathVariable int parkingLotId)throws Exception{
        if(parkingLotServiceImp.deleteParkingLotById(parkingLotId)==null)
            throw new Exception("不存在该id");
        return parkingLotServiceImp.deleteParkingLotById(parkingLotId);
    }
}
