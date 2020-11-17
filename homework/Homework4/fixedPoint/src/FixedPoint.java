import java.util.Scanner;

public class FixedPoint {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double x, x0, Tol;
        int i = 1;
        int maxIter;

        System.out.println("Enter approximate x: ");
        x0 = input.nextDouble();

        System.out.println("Desired tolerance: ");
        Tol = input.nextDouble();

        System.out.println("Maximum Iterations: ");
        maxIter = input.nextInt();

        while(i <= maxIter){
            x = g(x0);

            if(Math.abs(x-x0) < Tol){
                System.out.println("X: " + x);
                break;
            }
            System.out.println("Iteration: " + i + " Current Value = " + x);

            i++;
            x0 = x;

            if(i > maxIter){
                System.out.println("Method Failed after: " + maxIter);
                System.out.println("");
            }
        }
    }
    // enter in f(x)
    public static double f(double x){
        return x * Math.exp(3 * Math.pow(x, 2)) - 7 * x;
    }

    // enter in g(x)
    public static double g(double x){
        return x + .2 * f(x);
    }
}
