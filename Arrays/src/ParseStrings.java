import java.util.Arrays;

public class ParseStrings {
    public int[] stringToArrayDouble(String inputArray) {
        return Arrays.stream(inputArray.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
