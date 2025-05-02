package Exception;

public class DailyLimitExceededException extends RuntimeException {
    public DailyLimitExceededException() {
        super("The amount of daily limit exceeded");
    }

    public DailyLimitExceededException(String message) {
        super(message);
    }
}
