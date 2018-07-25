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

    @PostMapping("/parkingBoys")
    public ParkingBoy buildParkingBoy(@RequestBody ParkingBoy reqparkingBoy){
        ParkingBoy parkingBoy=new ParkingBoy(reqparkingBoy);
        //parkingBoy.setParkingBoyId(1L);
        return parkingBoyServiceImp.addparkingBoy(parkingBoy);
    }
    @PostMapping("/parkingBoys/{boyId}/parkingLots")
    public ParkingBoy addParkingLotForParkingBoy(@PathVariable int boyId,@RequestBody ParkingLot reqparkingLot){
        ParkingLot parkingLot=new ParkingLot(reqparkingLot);
        //parkingLot.setParkingLotId(lotId);
        return parkingBoyServiceImp.addParkingLot(boyId,parkingLot);
    }
}
