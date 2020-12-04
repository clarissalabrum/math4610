**Routine Name:** squareMatrix

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** The method takes in an interger (size) and returns a square matrix

**Input:** int size

**Output:** a random square matrix of specified size

**Usage/Example:**

To run the code it needs to be called from the main class in the following form

    squareMatrix(size);
    
The program will then return a square matrix.

**Implementation/Code:** The following is the code for backSubstitution

    public static double[][] squareMatrix(int size) {
        Random random = new Random();
        double[][] A = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                A[i][j] = random.nextInt(10) + 1;
            }
        }
        return A;
    }

**Last Modified:** December/2020
