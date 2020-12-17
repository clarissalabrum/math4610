**Routine Name:** power  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Takes a matrix and returns the largest eigenvalue

**Input:** matrix and vactor

**Output:** larget eigenvalue

**Usage/Example:**

To use this routine use the following call

    power(A, b);
    
The routine will print out the eigenvalue

    What's the size of the matrix?
    100
    eigenvalue: 1.135532048255749

**Implementation/Code:** The following is the code for power

    public static void power(double[][] A, double[] x0){
        double tol = .000001;
        double error = 10 * tol;
        int maxIter = 100;
        int iter = 0;
        double lambda0 = 0;
        double[] v = luDecomposition(A, x0);
        while (error > tol && iter < maxIter){
            v = vectorScalarMultiplication(1/mag2Norm(v), v);
            double[] z = luDecomposition(A, v);
            double lambda = vectorDotProduct(v, z);
            error = Math.abs(lambda - lambda0);
            lambda0 = lambda;
            for (int i = 0; i < v.length; i++) {
                v[i] =z[i];
            }
            System.out.println(iter++ + " " + lambda);
        }
        System.out.println("eigenvalue: " + lambda0);
    }

**Last Modified:** December/2020
