package com.springboot.Parking_api.Controllers;

import com.springboot.Parking_api.Enitys.ParkingLot;
import com.springboot.Parking_api.ServiceImp.ParkingLotServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ParkingLotsController {
    @Autowired
    ParkingLotServiceImp parkingLotServiceImp;

    @PostMapping("/parkingLots")
    public ArrayList<ParkingLot> buildParkingLot(@RequestBody ParkingLot reqparkingLot){
        ParkingLot parkingLot=new ParkingLot(reqparkingLot);
        //parkingLot.setParkingLotId(12L);
        return parkingLotServiceImp.addParkingLot(parkingLot);

    }

}
