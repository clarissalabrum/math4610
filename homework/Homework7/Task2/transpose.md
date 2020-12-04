**Routine Name:** transpose

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** The method takes a square matrix and returns the transpose of that matrix

**Input:** a 2d array

**Output:**  the transpose of the input 2d array.

**Usage/Example:**

To run the code it needs to be called from the main class in the following form

    transpose(A);
    
The program will then return a transposed square matrix.

**Implementation/Code:** The following is the code for transpose

    public static double[][] transpose(double[][] A) {
        double[][] AT = new double[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                AT[i][j] = A[j][i];
            }
        }
        return AT;
    }

**Last Modified:** December/2020
