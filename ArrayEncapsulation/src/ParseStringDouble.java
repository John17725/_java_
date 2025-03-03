import java.util.Arrays;

public class ParseStringDouble {
    public double[] stringToArrayDouble(String inputArray) {
        return Arrays.stream(inputArray.split(","))
                .map(String::trim)
                .mapToDouble(Double::parseDouble)
                .toArray();
    }
}
