package Exception;

public class EmailInvalidException extends Exception {
    public EmailInvalidException() {
        super("The email is invalid");
    }

    public EmailInvalidException(String message) {
        super(message);
    }
}
