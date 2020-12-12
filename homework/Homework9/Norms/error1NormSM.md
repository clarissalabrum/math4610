**Routine Name:** error1Norm  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Find the error between 2 vectors using the 1 norm.

**Input:** 2 vectors

**Output:**  the 1 norm  error of the vectors

**Usage/Example:**

To use this routine, a call like the following is needed

    double[] u = {1,2,3};
    double[] v = {2,3,4};
    double result = error1Norm(u, v);
    System.out.println(result);
    
The routine will then return the norm.

    0.3333333333333333

**Implementation/Code:** The following is the code for error1Norm

    public static double error1Norm(double[] u, double[] v){
        double[] diff = vectorSubtraction(u, v);
        return mag1Norm(diff) / mag1Norm(v);
    }

**Last Modified:** December/2020
