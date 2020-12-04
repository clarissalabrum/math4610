**Routine Name:** forwardSubstitution  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** The method takes a lower triangular matrix and a b matrix to find a solution to the system of linear equations

**Input:** A : a 2d matrix in lower triangular form, b: a 1D solution matrix.

**Output:** Prints out the solution to the system of linear equations

**Usage/Example:**

To run the code it needs to be called from the main class in the following form

    forwardSubstition(A, b);
    
Once the code is up and running it will ask for the following:

    What's the size of the matrix?
    
The program will then print out

    Solution:
    -0.45714285714285713
    0.22857142857142854
    0.05714285714285716
    0.02857142857142858
    0.14285714285714285

**Implementation/Code:** The following is the code for backSubstitution

    public static void forwardSubstitution(double[][] A, double[] b){
        double[] x = new double[b.length];
        //int lastIndex = b.length -1;
        x[0] = b[0]/A[0][0];
        for (int i = 1; i < A.length; i++) {
            double sum = b[i];
            for (int j = 0; j < i; j++) {
                sum = sum - A[i][j] * x[j];
            }
            x[i] = sum / A[i][i];
        }
        System.out.println("Solution:");
        for (double z : x) {
            System.out.println(z);
        }
    }

**Last Modified:** December/2020
