import java.util.Scanner;

public class Secant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double xold, tol;
        int maxiter;
        double xnew, x;

        System.out.println("Enter an Initial Guess:");
        xold = input.nextDouble();

        System.out.println("Enter a Second Initial Guess:");
        x = input.nextDouble();

        System.out.println("Enter the Desired Tolerance:");
        tol = input.nextDouble();

        System.out.println("Enter the Max Number of Iterations:");
        maxiter = input.nextInt();

        double error = 10 * tol;
        int iter = 0;

        while (iter < maxiter){
            iter++;
            xnew = x - f(x) * (x- xold) / (f(x) - f(xold));
            error = Math.abs(xnew - xold);
            xold = xnew;

            System.out.println("Iteration: " + iter + " Current Value = " + xold);

            if(error < tol){
                System.out.println("X: " + xnew);
                break;
            }

            if(iter > maxiter){
                System.out.println("Method Failed after: " + maxiter);
                System.out.println("");
            }
        }
    }

    // enter in f(x)
    public static double f(double x){
        return x * Math.exp(3 * Math.pow(x, 2)) - 7 * x;
    }
}

