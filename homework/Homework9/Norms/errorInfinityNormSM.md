**Routine Name:** errorInfinityNorm  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Find the error between 2 vectors using the infinity norm.

**Input:** 2 vectors

**Output:**  the infinity norm error of the vectors

**Usage/Example:**

To use this routine, a call like the following is needed

    double[] u = {1,2,3};
    double[] v = {2,3,4};
    double result = errorInfinityNorm(u, v);
    System.out.println(result);
    
The routine will then return the norm.

    0.25

**Implementation/Code:** The following is the code for errorInfinityNorm

    public static double errorInfinityNorm(double[] u, double[] v){
        double[] diff = vectorSubtraction(u, v);
        return magInfinityNorm(diff) / magInfinityNorm(v);
    }

**Last Modified:** December/2020
