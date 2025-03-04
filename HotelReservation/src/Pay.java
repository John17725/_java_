import enums.PayStatus;
import enums.TypePay;

public class Pay {
    private Reservation reservation;
    private double amount;
    private PayStatus payStatus;
    private TypePay typePay;


    public Pay(Reservation reservation, double amount, TypePay typePay,PayStatus payStatus) {
        this.reservation = reservation;
        this.amount = amount;
        this.typePay = typePay;
        this.payStatus = payStatus;
    }
}
