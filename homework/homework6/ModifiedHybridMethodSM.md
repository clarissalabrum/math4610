**Routine Name:** Hybrid

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Finds all the roots that it can within a specified interval.

**Input:** The routine will ask for a lower bound, an upper bound, and a tolerance. The function that is wanted to be used to find the roots needs to be entered into the f method
and its derivative into the the d method.

**Output:** The program will output a list of the roots that it found.

**Usage/Example:**

To compile and run the code the following needs to be used.

    javac Hybrid.java
    java Hybrid
    
Once the code is up and running it will ask for the following:

    Enter Lower Bound of Interval:
      -5
    Enter Upper Bound of Interval:
        6
    Enter the Desired Tolerance:
        .000001
    
The program will then print out

    The roots within [-5.0,6.0] are:
    -1.72295
    -1.70511
    -1.32159
    -1.03577
    -0.48362
    0.48361
    1.03576
    1.32158
    1.7051
    1.72294

**Implementation/Code:** The following is the code for Hybrid

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

    public class Method {
        double tol;
        double a, b;
        ArrayList<Double> roots;

        public Method(double a, double b, double tol){
            roots = new ArrayList<>();
            this.a = a;
            this.b = b;
            this.tol = tol;
            bisection(a, b, tol);
        }

        public ArrayList<Double> getRoots() {
            return roots;
        }

        public static double f(double x){
            return Math.exp(-1 * x * x) * Math.sin(4 * x * x - 1) + .051;
        }
        public static double d(double x){
            return -2 * x * Math.exp(-1*x*x) * (Math.sin(4*x*x - 1) - 4 * Math.cos(4*x*x-1));
        }

        public void bisection(double low, double up, double tol){
            if (up -low < .1) {
                newtons(low, tol);
                return;
            }
            double c = (up + low) / 2;
            bisection(low, c, tol);
            bisection(c, up, tol);
        }

        public void newtons(double c, double tol){
            double error = 10 * tol;
            int maxiter = 10;
            int iter = 0;
            while (error > tol && maxiter > iter){
                double xnew;
                xnew = c - f(c) / d(c);
                error = Math.abs(xnew- c);
                iter++;
                if (iter == maxiter) return;
                c = xnew;
            }
            if (!Double.isNaN(c)) {
                c = Math.floor(c * 100000) / 100000;
                if (!roots.contains(c)) {
                    roots.add(c);
                }
            }
        }
    }

**Last Modified:** December/2020
