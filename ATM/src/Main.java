import java.util.Scanner;
import Class.Account;
import Service.AccountService;

public class Main {
    public static void main(String[] args) {
        Account userAccount = new Account(109899);
        AccountService accountService = new AccountService();
        Scanner scannerInput = new Scanner(System.in);
        int optionATM = 0;
        double withdrawAmount = 0;
        do{
            try {
                System.out.println("Welcome to the ATM\nSelect option to operation");
                System.out.println("1.- Check balance");
                System.out.println("2.- Withdraw");
                System.out.println("3.- Check limit Withdraw");
                System.out.println("4.- Exit");
                optionATM = scannerInput.nextInt();
                switch(optionATM){
                    case 1:{
                        System.out.println(accountService.getBalance(userAccount));
                        break;
                    }
                    case 2:{
                        System.out.println("Enter amount to withdraw:");
                        withdrawAmount = scannerInput.nextDouble();
                        if(accountService.validWithdrawalAmount(userAccount, withdrawAmount)){
                            System.out.println("Successfully withdrawn");
                        }
                        break;
                    }
                    case 3:{
                        System.out.println(accountService.getWithdrawLimit(userAccount));
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }while (optionATM != 4);



    }
}