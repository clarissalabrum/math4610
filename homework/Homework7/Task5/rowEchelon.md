**Routine Name:** rowEchelon

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** The method takes in a system of linear equations and transforms it to row echelon form and then calls the backsubstitution method to solve the system.

**Input:** A 2d Array and a 1D array of solutions

**Output:** The row Echelon form of the matrix and the solution

**Usage/Example:**

To run the code it needs to be called from the main class in the following form

    rowEchelon(A, b);
    
The program will then print out the row echelon form and the solution

    Row Echelon Form
     10.00  2.00  6.00  7.00  5.00
      0.00  7.20 -0.40  2.70 -2.50
      0.00  0.00 -2.00 -5.00  3.00
      0.00  0.00  0.00-17.50 17.50
      0.00  0.00  0.00  0.00  7.25
    Solution:
    0.05648604269293924
    0.0264367816091954
    0.045812807881773394
    -0.002955665024630538
    0.025615763546798034

**Implementation/Code:** The following is the code for rowEchelon

    static void rowEchelon(double[][] A, double[] b){
        int size = b.length;
        for (int k = 0; k < size - 1; k++) { //column
            for (int i = k + 1; i < size; i++) {
                double factor = A[i][k]/A[k][k];
                for (int j = 0; j < size; j++) {
                    A[i][j] = A[i][j] - factor * A[k][j];
                }
                b[i] = b[i] -factor * b[k];
            }
        }
        System.out.println();
        System.out.println("Row Echelon Form");
        printMatrix(A);
        backSubstitution(A, b);
    }

**Last Modified:** December/2020
