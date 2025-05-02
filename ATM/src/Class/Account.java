package Class;

public class Account {
    public double balance;
    public double drawalLimit = 3000;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDrawalLimit() {
        return drawalLimit;
    }

    public void setDrawalLimit(double drawalLimit) {
        this.drawalLimit = drawalLimit;
    }
}
