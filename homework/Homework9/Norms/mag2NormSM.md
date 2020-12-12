**Routine Name:** mag2Norm  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** finds the 2 norm of a vector.

**Input:** a vector

**Output:**  the 2 norm of the vector

**Usage/Example:**

To use this routine, a call like the following is needed

    double[] v = {2,3,4};
    double result = mag2Norm(v);
    System.out.println(result);
    
The routine will then return the norm.

    5.385164807134504

**Implementation/Code:** The following is the code for mag2Norm

    public static double mag2Norm(double[] u){
        double sum = 0;
        for (int i = 0; i < u.length; i++) {
            sum = sum + Math.pow(Math.abs(u[i]), 2);
        }
        return Math.sqrt(sum);
    }

**Last Modified:** December/2020
