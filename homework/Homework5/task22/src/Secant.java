 import java.util.Scanner;

public class Secant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double upper, lower;
        double xold, tol;
        int maxiter;
        double xnew, x;

        System.out.println("Enter an Initial Guess:");
        xold = -5;//input.nextDouble();
        lower = xold;

        System.out.println("Enter a Second Initial Guess:");
        x = 6;//input.nextDouble();
        upper = x;

        System.out.println("Enter the Desired Tolerance:");
        tol = .000001;//input.nextDouble();

        System.out.println("Enter the Max Number of Iterations:");
        maxiter = 100;//input.nextInt();

        double error = 10 * tol;
        int iter = 0;

        while (iter < maxiter){
            iter++;
            while (f(xold) * f(x) > 0) {
                xold += 1;
                x -= 1;
            }
            xnew = x - f(x) * (x- xold) / (f(x) - f(xold));
            error = Math.abs(xnew - xold);
            if (f(xnew) * f(x) < 0) {
                xold = xnew;
            } else x = xnew;


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
}
