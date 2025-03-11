package Services;

import Models.Pay;
import enums.PayStatus;

import Repository.PayRepository;

public class PayService {
    PayRepository payRepository = new PayRepository();

    public void createPay(Pay pay) {
        try {
            payRepository.savePay(pay);
        }catch (Exception e){
            System.out.println("An error occurred."+e.getMessage());
        }
    }

    public boolean updatePayStatus(int idPay, PayStatus status) {
        try {
            payRepository.updatePayStatus(idPay,status);
            return true;
        }catch (Exception e){
            System.out.println("An error occurred."+e.getMessage());
            return false;
        }
    }
}
