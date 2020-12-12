**Routine Name:** vectorOuterProduct  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** multiplies two vectors creating the outer product

**Input:** 2 vectors of the same length

**Output:** the resulting matrix

**Usage/Example:**

To use this routine a call like the following needs to be made

    double[] u = {1,2,3};
    double[] v = {2,3,4};
    double[][] result = vectorOuterProduct(u, v);
    printMatrix(result);
    
The code will then return the result

      2.00  3.00  4.00
      4.00  6.00  8.00
      6.00  9.00 12.00

**Implementation/Code:** The following is the code for vectorOuterProduct

    public static double[][] vectorOuterProduct(double[] u, double[] v) {
        int n = u.length;
        double[][] w = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                w[i][j] = u[i] * v[j];
            }
        }
        return w;
    }

**Last Modified:** December/2020
