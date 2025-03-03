import java.util.regex.Pattern;

public class StringValidator {
    private static final String VALID_PATTERN = "^\\d+(\\.\\d+)?(, \\d+(\\.\\d+)?)*$";
    private static final Pattern PATTERN = Pattern.compile(VALID_PATTERN);

    public void validateInput(String input) {
        if(!PATTERN.matcher(input).matches()) {
            throw new IllegalArgumentException(String.format("Invalid input: %s", input));
        }
    }
}
