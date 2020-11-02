import java.util.Scanner;

public class RelativeError {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculating Relative Error");

        System.out.print("Enter x: ");
        double x = input.nextDouble();
        System.out.print("Enter y: ");
        double y = input.nextDouble();

        System.out.println("Relative Error: " + Math.abs(x - y));
    }
}
