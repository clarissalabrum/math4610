**Routine Name:** vectorAddition  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** adds 2 vectors

**Input:** 2 vectors of the same length

**Output:** the resultant vector

**Usage/Example:**

To use this routine a call like the following needs to be made

    double[] u = {1,2,3};
    double[] v = {2,3,4};
    double[] result = vectorAddition(u, v);
    printVector(result);
    
The code will then return the added vector

    3.0
    5.0
    7.0

**Implementation/Code:** The following is the code for vectorAddition

    public static double[] vectorAddition(double[] u, double[] v) {
        int n = u.length;
        double[] w = new double[n];
        for (int i = 0; i < n; i++) {
            w[i] = u[i] + v[i];
        }
        return w;
    }

**Last Modified:** December/2020
