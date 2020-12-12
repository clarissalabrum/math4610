**Routine Name:** matrixSubtraction  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Takes 2 matrices and returns the subtraction of the 2.

**Input:** 2 matrices

**Output:** a resulting matrix of the subtraction

**Usage/Example:**

To use this routine you will use a call like the following

    double[][] u = {{1,2}, {3,4}};
    double[][] v = {{2,3}, {4,5}};
    double[][] result = matrixSubtraction(u, v);
    printMatrix(result);
    
The routine will then print out the result

     -1.00 -1.00
     -1.00 -1.00

**Implementation/Code:** The following is the code for matrixSubtraction

    public static double[][] matrixSubtraction(double[][] A, double[][] B) {
        int n = A.length;
        double[][] C = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }

**Last Modified:** December/2020
