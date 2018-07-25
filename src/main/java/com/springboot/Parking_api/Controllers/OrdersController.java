package com.springboot.Parking_api.Controllers;

import com.springboot.Parking_api.Enitys.Order;
import com.springboot.Parking_api.Enitys.ParkingBoy;
import com.springboot.Parking_api.ServiceImp.OrderService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class OrdersController {
    @Autowired
    OrderService orderService;
    @GetMapping("/orders")
    public ArrayList<Order> getAllOrders(){
        return orderService.getOrders();
    }
    @GetMapping("/orders/{orderId}")
    public Order getOrderById(@PathVariable int orderId){
        return orderService.getOrderById(orderId);
    }
    @PostMapping("/orders")
    public ArrayList<Order> addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }
    @PutMapping("/orders/firstNotPickOrders")
    public ArrayList<Order> arrangeOrderForParkingBoy(@RequestBody ParkingBoy parkingBoy){
        orderService.arrangeOrderForParkingBoy(parkingBoy);
        return orderService.getOrders();
    }
}
