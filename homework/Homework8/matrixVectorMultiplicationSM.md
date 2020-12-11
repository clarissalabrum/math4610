**Routine Name:** matrixVectorMultiplication  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** multiplies a vector and matrix

**Input:** matrix and a vector

**Output:** a vector of the result

**Usage/Example:**

To us this routine you would do the call 

    double[] C = matrixVectorMultiplication(A5, b);

The code will then return the result

**Implementation/Code:** The following is the code for matrixVectorMultiplication

    public static double[] matrixVectorMultiplication(double[][] A, double[] b) {
        int n = b.length;
        double[] C = new double[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i]= 0;
                for (int k = 0; k < n; k++)
                    C[i] += A[i][k] * b[k];
            }
        }
        return C;
    }

**Last Modified:** December/2020
