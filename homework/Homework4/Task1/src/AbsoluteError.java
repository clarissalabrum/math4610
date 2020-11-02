import java.util.Scanner;

public class AbsoluteError {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculating Absolute Error");

        System.out.print("Enter x: ");
        double x = input.nextDouble();
        System.out.print("Enter y: ");
        double y = input.nextDouble();

        System.out.println("Absolute Error: " + Math.abs(x - y)/Math.abs(x));
    }
}
