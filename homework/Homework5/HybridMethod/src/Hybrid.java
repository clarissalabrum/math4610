import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hybrid {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double tol;
        double a, b;

        System.out.println("Enter Lower Bound of Interval:");
        a = input.nextDouble();

        System.out.println("Enter Upper Bound of Interval:");
        b = input.nextDouble();

        System.out.println("Enter the Desired Tolerance:");
        tol = input.nextDouble();

        Method solve = new Method(a, b, tol);
        ArrayList<Double> roots = solve.getRoots();
        Collections.sort(roots);
        System.out.println("The roots within [" + a + "," + b + "] are:");
        for (double x : roots) {
            System.out.println(x);
        }
    }
}

