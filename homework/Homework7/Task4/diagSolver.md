**Routine Name:** diagSolver

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** The method a diagonal matrix and a solution array and will print out the solution

**Input:** a 2d diagoinal array and a 1d solution array

**Output:** prints out the solutions to the system of linear equations

**Usage/Example:**

To run the code it needs to be called from the main class in the following form

    diagSolver(size);
    
The program will then printout the solution

Example

    7.00  0.00  0.00  0.00  0.00
    0.00  8.00  0.00  0.00  0.00
    0.00  0.00  1.00  0.00  0.00
    0.00  0.00  0.00  6.00  0.00
    0.00  0.00  0.00  0.00  2.00
    //call to diagSolver
    Solution:
    0.14285714285714285
    0.125
    1.0
    0.16666666666666666
    0.5

**Implementation/Code:** The following is the code for diagsolver

    static void diagSolver(double[][] A, double[] b){
        double[] x = new double[b.length];
        for (int i = 0; i < b.length; i++) {
            x[i] = b[i] / A[i][i];
        }
        System.out.println("Solution:");
        for (double z : x) {
            System.out.println(z);
        }
    }

**Last Modified:** December/2020
