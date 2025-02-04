import java.util.Scanner;

public class Newtons {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double xold, tol;
        int maxiter;
        double xnew;

        System.out.println("Enter an Initial Guess:");
        xold = input.nextDouble();

        System.out.println("Enter the Desired Tolerance:");
        tol = input.nextDouble();

        System.out.println("Enter the Max Number of Iterations:");
        maxiter = input.nextInt();

        double error = 10 * tol;
        int iter = 0;

        while (iter < maxiter){
            iter++;
            xnew = xold - f(xold) / d(xold);
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
        return Math.exp(-1 * x * x) * Math.sin(4 * x * x - 1) + .051;
    }
    public static double d(double x){
        return -2 * x * Math.exp(-1*x*x) * (Math.sin(4*x*x - 1) - 4 * Math.cos(4*x*x-1));
    }

}

