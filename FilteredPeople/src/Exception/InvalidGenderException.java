package Exception;

public class InvalidGenderException extends Exception {
    public InvalidGenderException() {
        super("This gender is invalid.");
    }

    public InvalidGenderException(String message) {
        super(message);
    }
}
