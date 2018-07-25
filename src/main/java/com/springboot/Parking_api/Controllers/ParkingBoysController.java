package com.springboot.Parking_api.Controllers;

import com.springboot.Parking_api.Enitys.ParkingBoy;
import com.springboot.Parking_api.Enitys.ParkingLot;
import com.springboot.Parking_api.ServiceImp.ParkingBoyServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ParkingBoysController {
    @Autowired
    ParkingBoyServiceImp parkingBoyServiceImp;

    @GetMapping("/parkingBoys")
    public ArrayList<ParkingBoy> getAllParkingBoy(){
        return parkingBoyServiceImp.getParkingBoys();
    }
    @PostMapping("/parkingBoys")
    public ArrayList<ParkingBoy> buildParkingBoy(@RequestBody ParkingBoy reqparkingBoy){
        //ParkingBoy parkingBoy=new ParkingBoy(reqparkingBoy);
        //parkingBoy.setParkingBoyId(1L);
         parkingBoyServiceImp.addparkingBoy(reqparkingBoy);
         return parkingBoyServiceImp.getParkingBoys();
    }
    @PostMapping("/parkingBoys/{boyId}/parkingLots")
    public ArrayList<ParkingBoy> addParkingLotForParkingBoy(@PathVariable int boyId,@RequestBody ParkingLot reqparkingLot){
         parkingBoyServiceImp.addParkingLot(boyId,reqparkingLot);
         return parkingBoyServiceImp.getParkingBoys();
    }
    @DeleteMapping("/parkingBoys/{boyId}")
    public ArrayList<ParkingBoy> deleteParkingBoyById(@PathVariable int boyId)throws Exception{
        if(parkingBoyServiceImp.deleteParkingBoyById(boyId)==null)
            throw new Exception("不存在该id");
        return parkingBoyServiceImp.deleteParkingBoyById(boyId);
    }
}
