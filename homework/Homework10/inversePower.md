**Routine Name:** inversePower  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Takes a matrix and returns the samllest eigenvalue

**Input:** the inverse matrix and a vector

**Output:** smallest eigenvalue

**Usage/Example:**

To use this routine use the following call

    inversePower(A, b);
    
The routine will print out the eigenvalue

    What's the size of the matrix?
    100
    eigenvalue: -8.510955066505015E-45

**Implementation/Code:** The following is the code for inversePower

    public static void inversePower(double[][] A, double[] x0){
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
            //System.out.println(iter++ + " " + lambda);
        }
        lambda0 = 1/ lambda0;
        System.out.println("eigenvalue: " + lambda0);
    }

**Last Modified:** December/2020
