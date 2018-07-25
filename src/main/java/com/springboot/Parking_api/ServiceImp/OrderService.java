package com.springboot.Parking_api.ServiceImp;

import com.springboot.Parking_api.Enitys.Order;
import com.springboot.Parking_api.Enitys.ParkingBoy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class OrderService {
    private ArrayList<Order> orders;

    public OrderService(){
        this.orders=new ArrayList<>();
        this.orders.add(new Order(1,"0",0,true));
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public Order getOrderById(int orderId) {
        for(Order order:this.getOrders()){
            if(order.getOrderId()==orderId){
                return order;
            }
        }
        return null;
        //return this.orders.stream().filter(order->order.getOrderId()==orderId).collect(Collectors.toList());
    }

    public ArrayList<Order> addOrder(Order order) {
        this.getOrders().add(order);
        return this.getOrders();
    }

    public void arrangeOrderForParkingBoy(ParkingBoy parkingBoy) {
        for(Order order:this.getOrders()){
            if(order.isStatus()){
                order.setParkingBoyId(parkingBoy.getParkingBoyId());
                order.setStatus(false);
                break;
            }
        }
    }
}
