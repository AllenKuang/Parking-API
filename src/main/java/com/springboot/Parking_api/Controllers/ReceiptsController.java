package com.springboot.Parking_api.Controllers;

import com.springboot.Parking_api.Enitys.Receipt;
import com.springboot.Parking_api.ServiceImp.ReceiptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ReceiptsController  {
    @GetMapping("/receipts")
    public ArrayList<Receipt> getreceiptId(){
        return receiptsService.getReceipts();
    }
    @Autowired
    ReceiptsService receiptsService;
    @PostMapping("/receipts")
    public ArrayList<Receipt> addReceiptToReceipts(@RequestBody Receipt receipt){
        return receiptsService.addReceipt( receipt);
    }
    @DeleteMapping("/receipts/{receiptId}")
    public ArrayList<Receipt> deleteReceiptById(@PathVariable String receiptId) throws Exception{
        if(receiptsService.deleteReceipt(receiptId)==null){
            throw new Exception("没有该小票");
        }
        return receiptsService.deleteReceipt(receiptId);
    }
}
