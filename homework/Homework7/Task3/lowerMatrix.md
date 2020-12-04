**Routine Name:** lowerMatrix

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** The method takes in an interger (size) and returns a lower triangular square matrix

**Input:** int size

**Output:** a random lower triangular square matrix of specified size

**Usage/Example:**

To run the code it needs to be called from the main class in the following form

    lowerMatrix(size);
    
The program will then return an upper triangular square matrix.

**Implementation/Code:** The following is the code for lowerMatrix

    public static double[][] lowerMatrix(int size){
        double[][] A = upperMatrix(size);
        return transpose(A);
    }

**Last Modified:** December/2020
