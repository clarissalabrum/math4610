**Routine Name:** jacobi  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Uses jacobi iteration to solve a system on linear equations

**Input:** A coefficient matrix A and the solution array b

**Output:** prints out the solution to the system to eth .000001 tolerance

**Usage/Example:**

To use this code the following call can be used

    jacobi(A, b);
    
The solution will then print out.

For example:

    A
     11.00  2.00
     -6.00 13.00

    b
    13.0
    7.0

    Solution:
    0.9999999365095271
    1.0000001611681237

**Implementation/Code:** The following is the code for jacobi

    public static void jacobi(double[][] A, double[] b) {
        double tol = .000001;
        double error = 10 * tol;
        int n = b.length;
        int iter = 1;
        int maxIter = 1000;
        double[] xold = new double[n];
        double[] xnew = new double[n];

        for (int i = 0; i < n; i++) {
            xold[i] = 2;
        }

        while(error > tol && iter < maxIter) {
            for (int i = 0; i < n; i++) {
                xnew[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        xnew[i] = xnew[i] - A[i][j] * xold[j];
                    }
                }
                xnew[i] = xnew[i] / A [i][i];
            }
            error = 0;
            for (int i = 0; i < n; i++) {
                error += Math.pow((xnew[i] - xold[i]), 2);
            }
            error = Math.sqrt(error);

            for (int i = 0; i < n; i++) {
                xold[i] = xnew[i];
            }
            iter++;
        }
            System.out.println("i: " + iter);
            printVector(xold);
    }

**Last Modified:** December/2020
