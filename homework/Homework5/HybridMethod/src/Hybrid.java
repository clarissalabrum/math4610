import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hybrid {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double tol;
        double a, b;

        System.out.println("Enter Lower Bound of Interval:");
        a = -5;//input.nextDouble();

        System.out.println("Enter Upper Bound of Interval:");
        b = 6;//input.nextDouble();

        System.out.println("Enter the Desired Tolerance:");
        tol = .000001;//input.nextDouble();

        Method solve = new Method(a, b, tol);
        ArrayList<Double> roots = solve.getRoots();
        Collections.sort(roots);
        System.out.println("The roots within [" + a + "," + b + "] are:");
        for (double x : roots) {
            System.out.println(x);
        }
    }
}

