import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            NumberValidator validatorInput = new NumberValidator();
            ParseStrings stringParse = new ParseStrings();
            Scanner input = new Scanner(System.in);
            System.out.println("Inser array integers: ");
            String inputArray = input.nextLine();
            validatorInput.validateInput(inputArray);
            int[] inputArrayDouble = stringParse.stringToArrayDouble(inputArray);
            MathArrayDemo arrayExample = new MathArrayDemo(inputArrayDouble);
            System.out.println("Raices cuadradas: "+ Arrays.toString(arrayExample.getSqareRoot()));
            System.out.println("NUmeros elevados al cubo: "+ Arrays.toString(arrayExample.getCubeRoot()));
            input.close();
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }




    }
}