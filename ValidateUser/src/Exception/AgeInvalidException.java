package Exception;

public class AgeInvalidException extends Exception {
    public AgeInvalidException() {
        super("The age is not enough");
    }

    public AgeInvalidException(String message) {
        super(message);
    }
}
