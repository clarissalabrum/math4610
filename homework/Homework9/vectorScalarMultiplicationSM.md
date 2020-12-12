**Routine Name:** vectorScalarMultiplication  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** multiplies a vector by a constant

**Input:** a vector and a scalar

**Output:** the resultent vector

**Usage/Example:**

To use this routine a call like the following needs to be made

    double c = 5.0;
    double[] v = {2,3,4};
    double[] result = vectorScalarMultiplication(c, v);
    printVector(result);
    
The code will then return the multiplied vector

    10.0
    15.0
    20.0

**Implementation/Code:** The following is the code for vectorScalarMultiplication

    public static double[] vectorScalarMultiplication(double c, double[] u) {
        int n = u.length;
        double[] w = new double[n];
        for (int i = 0; i < n; i++) {
            w[i] = c * u[i];
        }
        return w;
    }

**Last Modified:** December/2020
