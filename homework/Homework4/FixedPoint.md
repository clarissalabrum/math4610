**Routine Name:** Fixed Point  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Uses fixed point iteration to appoximate a root of a function

**Input:** approximate root, tolerance, and max iterations

**Output:** value per iteration and final apprxomation if within tolerance

**Usage/Example:**

To implement this code the following commands can be used

    javac FixedPoint.java
    java FixedPoint

The code will then ask for the following

    Enter approximate x: 
    Desired tolerance: 
    Maximum Iterations: 

The output will be in the following form

    Iteration: 1 Current Value = 0.011700001661267445
    Iteration: 2 Current Value = -0.0023390391666966714
    Iteration: 3 Current Value = 4.6780015500008307E-4
    ...
    Iteration: 10 Current Value = -5.987837889121086E-9
    X: 1.1975675778242172E-9

**Implementation/Code:** The following is the code for FixedPoint

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

**Last Modified:** November/2020
