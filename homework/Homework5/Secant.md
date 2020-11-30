**Routine Name:** Secant  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** This is a root finding routine that uses the secant method to find the roots

**Input:** First initial guess : double, Second initial guess : double, tolerance : double, Max number of iterations : int.

**Output:** Steps taken towards the root and then the approximation of the root

**Usage/Example:**

To compile and run the code the following needs to be used.

    javac Secant.java
    java Secant
    
The equation the you want to find the roots for needs to be entered into the f method.
Once the code is up and running it will ask for the following:

    Enter an Initial Guess:
      -.1
    Enter a Second Initial Guess:
      .15
    Enter the Desired Tolerance:
      .0000001
    Enter the Max Number of Iterations:
      100
    
The program will then print out

    Iteration: 1 Current Value = 3.973385996583756E-4
    Iteration: 2 Current Value = -4.691371934956168E-6
    Iteration: 3 Current Value = 5.5241142798978515E-8
    Iteration: 4 Current Value = -6.504880800672908E-10
    X: -6.504880800672908E-10

**Implementation/Code:** The following is the code for Secant.java

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


**Last Modified:** November/2020
