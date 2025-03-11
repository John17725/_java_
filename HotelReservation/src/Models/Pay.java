package Models;

import enums.PayStatus;
import enums.TypePay;

public class Pay {
    private int payId;
    private double amount;
    private PayStatus payStatus;
    private TypePay typePay;


    public Pay(int payId, double amount, TypePay typePay,PayStatus payStatus) {
        this.payId = payId;
        this.amount = amount;
        this.typePay = typePay;
        this.payStatus = payStatus;
    }

    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PayStatus getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(PayStatus payStatus) {
        this.payStatus = payStatus;
    }

    public TypePay getTypePay() {
        return typePay;
    }

    public void setTypePay(TypePay typePay) {
        this.typePay = typePay;
    }
}
