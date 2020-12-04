**Routine Name:** diagMatrix

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** The method takes in an interger (size) and returns a diagonal square matrix

**Input:** int size

**Output:** a random diagonal matrix of specified size

**Usage/Example:**

To run the code it needs to be called from the main class in the following form

    diagMatrix(size);
    
The program will then return a diagonal matrix.

**Implementation/Code:** The following is the code for diagMatrix

    public static double[][] diagMatrix(int size){
        Random random = new Random();
        double[][] A = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i) {
                    A[i][j] = random.nextInt(10) + 1;
                } else {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }

**Last Modified:** December/2020
