**Routine Name:** pivotingGaussElimination  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** This code will do gaussian elimination using a scaled pivoting stategy

**Input:** Takes a square matrix A and a solution array b

**Output:** Will print out the found solution

**Usage/Example:**

To use this routine a call like the following should be used.

    pivotingGaussElimination(A5, C);
    
Once the code is up and running it will ask for the following:

    What's the size of the matrix?
    
The program will then print out

    Solution:
    3.9513244545850665
    -0.9260250780364719
    -0.26989239112439967
    -0.13158084918992677
    ...

**Implementation/Code:** The following is the code for pivotingGaussElimination

    static void pivotingGaussElimination(double[][] A, double[] b) {
        int n = b.length;
        int[] imap = new int[n];
        double[] s = new double[n];
        double[] x = new double[n];
        double smax;

        for (int i = 0; i < n; i++) {
            s[i] = Math.abs(A[i][0]);
            for (int j = 1; j < n; j++) {
                double temp = Math.abs(A[i][j]);
                if (temp > s[i]) {
                    s[i] = temp;
                }
            }

        }

        for (int i = 0; i < n; i++) {
            imap[i] = i;
        }

        for (int k = 0; k < n - 1; k++) {
            smax = Math.abs(A[imap[k]][k]) / s[imap[k]];
            int q = -1;
            for (int i = k+1; i < n; i++) {
                double temp = Math.abs(A[imap[i]][k] / s[imap[i]]);
                if (temp > smax) {
                    smax = temp;
                    q = i;
                }
            }
            if (q != -1) {
                int temp = imap[k];
                imap[k] = imap[q];
                imap[q] = temp;
            }
            for (int i = k+1; i < n; i++) {
                double factor = A[imap[i]][k] / A[imap[k]][k];
                for (int j = k+1; j < n; j++) {
                    A[imap[i]][j] = A[imap[i]][j] - factor * b[imap[k]];
                }
            }

            x[n-1] = b[imap[n-1]] / A[imap[n-1]][n-1];
            for (int i = n-2; i >= 0; i--) {
                double sum = b[imap[i]];
                for (int j = i+1; j < n; j++) {
                    sum = sum - A[imap[i]][j] * x[j];
                }
                x[i] = sum / A[imap[i]][i];
            }
        }
        System.out.println("Solution:");
        for (double z : x) {
            System.out.println(z);
        }

    }

**Last Modified:** December/2020
