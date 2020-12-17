**Routine Name:** matrixInfinitynorm  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Takes a matrix and returns the infinity norm

**Input:** matrix

**Output:** infinity norm

**Usage/Example:**

To use this routine use the following call

    System.out.println("Matrix Infinity Norm");
    System.out.println(matrixInfinitynorm(A));
    
The routine will print out the eigenvalue

    What's the size of the matrix?
    100
    Matrix Infinity Norm
    77.0

**Implementation/Code:** The following is the code for matrixInfinitynorm

    public static double matrixInfinitynorm(double[][] A){
        int size = A.length;
        double max = 0;
        for (int i = 0; i < size; i++) {
            double sum = 0;
            for (int j = 0; j < size; j++) {
                sum += A[i][j];
            }
            if (sum > max)
                max = sum;
        }
        return max;
    }

**Last Modified:** December/2020
