**Routine Name:** mag1Norm  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** finds the 1 norm of a vector.

**Input:** a vector

**Output:**  the 1 norm of the vector

**Usage/Example:**

To use this routine, a call like the following is needed

    double[] v = {2,3,4};
    double result = mag1Norm(v);
    System.out.println(result);
    
The routine will then return the norm.

    9.0

**Implementation/Code:** The following is the code for mag1Norm

    public static double mag1Norm(double[] u){
        double sum = 0;
        for (int i = 0; i < u.length; i++) {
            sum = sum + Math.abs(u[i]);
        }
        return sum;
    }

**Last Modified:** December/2020
