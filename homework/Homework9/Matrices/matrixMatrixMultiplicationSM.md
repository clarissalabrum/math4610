**Routine Name:** matrixMatrixMultiplication  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** takes 2 matrices and returns their product

**Input:** 2 matrices

**Output:** a resulting matrix of the multiplication

**Usage/Example:**

To use this routine you will use a call like the following

    double[][] u = {{1,2}, {3,4}};
    double[][] v = {{2,3}, {4,5}};
    double[][] result = matrixMatrixMultiplication(u, v);
    printMatrix(result);
    
The routine will then print out the result

     10.00 13.00
     22.00 29.00

**Implementation/Code:** The following is the code for matrixMatrixMultiplication

    public static double[][] matrixMatrixMultiplication(double[][] A, double[][] B) {
        int Arows = A.length;
        int Acols = B.length;
        int Bcols = B[0].length;

        double[][] C = new double[Arows][Bcols];
        for (int i = 0; i < Arows; i++) {
            for (int j = 0; j < Bcols; j++) {
                C[i][j] = 0;
                for (int k = 0; k < Acols; k++) {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

**Last Modified:** December/2020
