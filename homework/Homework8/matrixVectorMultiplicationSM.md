**Routine Name:** matrixVectorMultiplication  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** multiplies a vector and matrix

**Input:** matrix and a vector

**Output:** a vector of the result

**Usage/Example:**

To use this routine you would do the call 

        double[][] u = {{1,2}, {3,4}};
        double[] v = {2,3};
        double[] result = matrixVectorMultiplication(u, v);
        printVector(result);

The code will then return the result

        8.0
        18.0

**Implementation/Code:** The following is the code for matrixVectorMultiplication

    public static double[] matrixVectorMultiplication(double[][] A, double[] b) {
        int rows = A.length;
        int cols = b.length;
        double[] C = new double[rows];
        for (int i = 0; i < rows; i++) {
            C[i]= 0;
            for (int k = 0; k < cols; k++) {
                C[i] += A[i][k] * b[k];
            }
        }
        return C;
    }

**Last Modified:** December/2020
