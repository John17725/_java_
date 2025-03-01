import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the side A: ");
        double sideA =  Double.parseDouble(input.nextLine());
        System.out.println("Please enter the side B: ");
        double sideB =  Double.parseDouble(input.nextLine());
        System.out.println("Please enter the side C: ");
        double sideC =  Double.parseDouble(input.nextLine());
        TriangleArea triangle_1 = new TriangleArea(sideA, sideB, sideC);
        System.out.printf("The triangle area is: "+triangle_1.computeArea());
        input.close();

    }
}