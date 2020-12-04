**Routine Name:** upperMatrix

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** The method takes in an interger (size) and returns a upper triangular square matrix

**Input:** int size

**Output:** a random upper triangular square matrix of specified size

**Usage/Example:**

To run the code it needs to be called from the main class in the following form

    upperMatrix(size);
    
The program will then return an upper triangular square matrix.

**Implementation/Code:** The following is the code for backSubstitution

    public static double[][] upperMatrix(int size){
        double[][] A = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j >= i) {
                    A[i][j] = i + j -1;
                } else {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }

**Last Modified:** December/2020
