**Routine Name:** error2Norm  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Find the error between 2 vectors using the 2 norm.

**Input:** 2 vectors

**Output:**  the 2 norm error of the vectors

**Usage/Example:**

To use this routine, a call like the following is needed

    double[] u = {1,2,3};
    double[] v = {2,3,4};
    double result = error2Norm(u, v);
    System.out.println(result);
    
The routine will then return the norm.

    0.32163376045133846

**Implementation/Code:** The following is the code for error2Norm

    public static double error2Norm(double[] u, double[] v){
        double[] diff = vectorSubtraction(u, v);
        return mag2Norm(diff) / mag2Norm(v);
    }

**Last Modified:** December/2020
