package Exception;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException() {
        super("The amount of insufficient balance is insufficient");
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
