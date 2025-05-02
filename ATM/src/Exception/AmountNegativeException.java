package Exception;

public class AmountNegativeException extends Exception {
    public AmountNegativeException() {
        super("The amount cannot be negative");
    }

    public AmountNegativeException(String message) {
        super(message);
    }
}
