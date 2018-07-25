package com.springboot.Parking_api.ServiceImp;

import com.springboot.Parking_api.Enitys.Receipt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReceiptsService {
    private ArrayList<Receipt> receipts;

    public ReceiptsService(){
        this.receipts=new ArrayList<>();
        this.receipts.add(new Receipt("123"));
    }

    public ArrayList<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(ArrayList<Receipt> receipts) {
        this.receipts = receipts;
    }

    public ArrayList<Receipt> addReceipt(Receipt receipt) {
        this.getReceipts().add(receipt);
        return this.getReceipts();
    }

    public ArrayList<Receipt> deleteReceipt(String receiptId) {
        for(int i=0;i<this.getReceipts().size();i++){
            if(this.getReceipts().get(i).getReceiptId().equals(receiptId)){
                this.getReceipts().remove(i);
            }else{
                return null;
            }
        }
        return this.getReceipts();
    }
}
