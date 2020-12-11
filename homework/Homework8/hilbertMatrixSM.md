**Routine Name:** hilbertMatrix  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** return a Hilbert matrix of a specifoed size

**Input:** int size

**Output:** a hilber matrix

**Usage/Example:**

To use this routine you would do the call 

    double[][] A5 = hilbertMatrix(size);

The code will then return the Hilbert matrix

**Implementation/Code:** The following is the code for hilbertMatrix

    public static double[][] hilbertMatrix(int n){
        double[][] A = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = 1.0 / (i + j + 1);
            }
        }
        return A;
    }

**Last Modified:** December/2020
