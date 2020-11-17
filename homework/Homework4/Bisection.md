**Routine Name:** Bisection  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Use the bisection iteration method to approximate a root

**Input:** lower bound on interval, upper bound on interval, and a tolerance

**Output:** the approximated value.

**Usage/Example:**

To run this code use the following commands

    javac bisection.java
    java bisection

The code will then ask for the input 

    Enter Lower Bound of Interval:
    Enter Upper Bound of Interval:
    Enter the Desired Tolerance:
    
It will use these values and a hard coded function to evaluate the bisection method

**Implementation/Code:** The following is the code for bisection

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

**Last Modified:** November/2020
