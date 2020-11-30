**Routine Name:** Newtons  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** This is a root finding routine that used Newtons Method for finding the roots

**Input:** Initial guess : double, Tolerence : double, Max number of iterations : int.

**Output:** All iteration values and final approximation of the root.

**Usage/Example:**

To compile and run the code the following needs to be used.

    javac Newtons.java
    java Newtons
    
Specific equations will need to be entered into the f and d methods in order to calculate the roots.
Once the code is up and running it will ask for the following:

    Enter an Initial Guess:
      .25
    Enter the Desired Tolerance:
      .000000001
    Enter the Max Number of Iterations:
      100
    
The program will then print out

    Iteration: 1 Current Value = -0.02117111218386475
    Iteration: 2 Current Value = 9.508399180613997E-6
    Iteration: 3 Current Value = -8.596520441024949E-16
    Iteration: 4 Current Value = 0.0
    X: 0.0

**Implementation/Code:** The following is the code for Newtons.java

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
            return x * Math.exp(3 * Math.pow(x, 2)) - 7 * x;
        }
        public static double d(double x){
            return (6 * Math.pow(x, 2) + 1) * Math.exp(3 * Math.pow(x, 2)) - 7;
        }

    }

**Last Modified:** November/2020
