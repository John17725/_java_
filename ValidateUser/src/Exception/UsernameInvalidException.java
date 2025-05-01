package Exception;

public class UsernameInvalidException extends Exception {
    public UsernameInvalidException() {
        super("The username is invalid.");
    }

    public UsernameInvalidException(String message) {
        super(message);
    }
}
