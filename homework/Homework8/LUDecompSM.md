**Routine Name:** LUDecomposition  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Takes a square system of linear equations and solves them using L U decomposition

**Input:** A a square matrix of coeffiecients and b an array of solutions

**Output:** returns the solution to the system on equations

**Usage/Example:**

To call this routine the following needs to be used

    luDecomposition(A4, b);
    
Once the code is up and running it will ask for the size of the system

    What's the size of the matrix?
    4
    
The program will then print out the solution including the subsolutions of the lower matrix, the solution y, then the upper matrix followed by the final solution

    lower
      1.00  0.00  0.00  0.00
      3.00  1.00  0.00  0.00
      8.00  4.15  1.00  0.00
      1.00 -0.00  0.25  1.00

    y
    1.0
    -2.0
    1.3076923076923084
    -0.3269230769230771

    upper
      1.00  7.00  5.00  8.00
      0.00-13.00-10.00-18.00
      0.00  0.00  8.00 11.00
      0.00  0.00  0.00 -7.00

    Solution:
    0.04028423499577344
    0.01283812341504643
    0.09924450549450554
    0.046703296703296725

**Implementation/Code:** The following is the code for LuDecomposition

    static void luDecomposition(double[][] mat, double[] b)
    {
        int n = mat.length;
        double[][] lower = new double[n][n];
        double[][] upper = new double[n][n];

        // Decomposing matrix into Upper and Lower
        // triangular matrix
        for (int i = 0; i < n; i++)
        {
            // Upper Triangular
            for (int k = i; k < n; k++) {
                // Summation of L(i, j) * U(j, k)
                int sum = 0;
                for (int j = 0; j < i; j++) {
                    sum += (lower[i][j] * upper[j][k]);
                }
                // Evaluating U(i, k)
                upper[i][k] = mat[i][k] - sum;
            }

            // Lower Triangular
            for (int k = i; k < n; k++) {
                if (i == k) {
                    lower[i][i] = 1; // Diagonal as 1
                } else {
                    // Summation of L(k, j) * U(j, i)
                    int sum = 0;
                    for (int j = 0; j < i; j++) {
                        sum += (lower[k][j] * upper[j][i]);
                    }
                    // Evaluating L(k, i)
                    lower[k][i] = (mat[k][i] - sum) / upper[i][i];
                }
            }
        }

        //solve
        double[] y = forwardSubstitution(lower, b);
        double[] x = backSubstitution(upper, y);

        //display
        System.out.println("lower");
        printMatrix(lower);
        System.out.println('y');
        for (double z : y) {
            System.out.println(z);
        }
        System.out.println();
        System.out.println("upper");
        printMatrix(upper);

        System.out.println("Solution:");
        for (double z : x) {
            System.out.println(z);
        }

    }

**Last Modified:** December/2020
