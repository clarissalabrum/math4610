**Routine Name:** matrix1norm  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Takes a matrix and returns the 1 norm of the matrix

**Input:** a matrix

**Output:** the 1 norm of the matrix

**Usage/Example:**

To use this routine use the following call

    matrix1norm(A);
    
The routine will print out the matrix 1 norm

    What's the size of the matrix?
    100
    Matrix 1 Norm
    143.0

**Implementation/Code:** The following is the code for matrix1norm

    public static double matrix1norm(double[][] A){
        int size = A.length;
        double max = 0;
        for (int i = 0; i < size; i++) {
            double sum = 0;
            for (int j = 0; j < size; j++) {
                sum += A[j][i];
            }
            if (sum > max)
                max = sum;
        }
        return max;
    }

**Last Modified:** December/2020
