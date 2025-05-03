package Exception;

public class EmailInvalidException extends Exception {
    public EmailInvalidException() {
        super("Email invalid");
    }

    public EmailInvalidException(String message) {
        super(message);
    }
}
