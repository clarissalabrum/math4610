**Routine Name:** Hybrid  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Uses a hybrid method of bisection and newtons to find roots of a function

**Input:** Lower Bound : double, Upper Bound : double, Tolerance : double, Max Iteration : int.

**Output:** The approximation of the root

**Usage/Example:**

To compile and run the code the following needs to be used.

    javac Hybrid.java
    java Hybrid
    
The funtion that the roots are wanted for needs to be added to the f method and it's derivative to the d method.
Once the code is up and running it will ask for the following:

    Enter Lower Bound of Interval:
      -.2
    Enter Upper Bound of Interval:
      .3
    Enter the Desired Tolerance:
      .0000001
    Enter the Max Number of Iterations:
      100
    
The program will then print out

    Root: 3.3087224502121107E-23

**Implementation/Code:** The following is the code for Hybrid.java

    import java.util.Scanner;

    public class Hybrid {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            double tol;
            int maxiter;
            double xnew;

            double a, b, c;
            double fa, fb, fc;


            System.out.println("Enter Lower Bound of Interval:");
            a = input.nextDouble();
            fa = f(a);

            System.out.println("Enter Upper Bound of Interval:");
            b = input.nextDouble();
            fb = f(b);

            System.out.println("Enter the Desired Tolerance:");
            tol = input.nextDouble();

            System.out.println("Enter the Max Number of Iterations:");
            maxiter = input.nextInt();

            double error = 10 * tol;
            double errb = error;
            double errn;
            int iter = 0;
            c = .5 * (a+b);

            while (error > tol && iter < maxiter){
                xnew = c - f(c) / d(c);
                errn = Math.abs(xnew- c);
                if(errn > error){
                    for (int i = 0; i < 4; i++) {
                        fc = f(c);
                        if (fa * fc > 0){
                            a = c;
                            fa = fc;
                        } else {
                            b = c;
                            fb = fc;
                        }
                        c = (a+b)/2;
                        errb = Math.abs(b-a);
                    }
                    error = errb;
                } else {
                    c = xnew;
                    error = errn;
                }
            }

            System.out.println("Root: " + c);
        }

        // enter in f(x)
        public static double f(double x){
            return x * Math.exp(3 * Math.pow(x, 2)) - 7 * x;
        }
        public static double d(double x){
            return (6 * Math.pow(x, 2) + 1) * Math.exp(3 * Math.pow(x, 2)) - 7;
        }
    }

**Last Modified:** Novemeber/2020
