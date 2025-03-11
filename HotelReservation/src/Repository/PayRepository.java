package Repository;

import Models.Pay;

import enums.PayStatus;

import java.util.HashMap;
import java.util.Map;

public class PayRepository {
    private Map<Integer, Pay> payments = new HashMap<>();

    public void savePay(Pay payment) {
        try {
            payments.put(payment.getPayId(), payment);
            System.out.println("Payment added");
        }catch (Exception e){
            System.out.println("Error adding payment"+e.getMessage());
        }
    }

    public void updatePayStatus(int idPay, PayStatus status){
        Pay pay = payments.get(idPay);
        pay.setPayStatus(status);
        payments.put(idPay, pay);
    }
}
