import java.util.Scanner;

public class Bisection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, tol;
        double fa, fb, fc;


        System.out.println("Enter Lower Bound of Interval:");
        a = input.nextDouble();
        fa = f(a);

        System.out.println("Enter Upper Bound of Interval:");
        b = input.nextDouble();
        fb = f(b);

        if (fa * fb > 0) System.exit(0);

        System.out.println("Enter the Desired Tolerance:");
        tol = input.nextDouble();

        int maxIter = (int) (Math.log(tol/(b-a)) / Math.log(.5)) + 1;
        double c = (a+b)/2;

        for (int i = 0; i < maxIter; i++) {
            c = (a+b)/2;
            fc = f(c);
            if (fa * fc > 0){
                a = c;
                fa = fc;
            } else {
                b = c;
            }
        }

        System.out.println("X: " + c);
    }

    // enter in f(x)
    public static double f(double x){
        return x * Math.exp(3 * Math.pow(x, 2)) - 7 * x;
    }
}
