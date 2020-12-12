**Routine Name:** magInfinityNorm  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** finds the infinity norm of a vector.

**Input:** a vector

**Output:**  the infinity norm of the vector

**Usage/Example:**

To use this routine, a call like the following is needed

    double[] v = {2,3,4};
    double result = magInfinityNorm(v);
    System.out.println(result);
    
The routine will then return the norm.

    4.0

**Implementation/Code:** The following is the code for magInfinityNorm

    public static double magInfinityNorm(double[] u){
        double max = Math.abs(u[0]);
        for (int i = 1; i < u.length; i++) {
            double temp = Math.abs(u[i]);
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

**Last Modified:** December/2020
