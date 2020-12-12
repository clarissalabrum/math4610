**Routine Name:** vectorDotProduct  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** multiplies two vectors creating the dot product

**Input:** 2 vectors of the same length

**Output:** the resulting value

**Usage/Example:**

To use this routine a call like the following needs to be made

    double[] u = {1,2,3};
    double[] v = {2,3,4};
    double result = vectorDotProduct(u, v);
    System.out.println(result);
    
The code will then return the result

    20.0

**Implementation/Code:** The following is the code for vectorDotProduct

    public static double vectorDotProduct(double[] u, double[] v) {
        int n = u.length;
        double product = 0;
        for (int i = 0; i < n; i++) {
            product = product + u[i] * v[i];
        }
        return product;
    }

**Last Modified:** December/2020
