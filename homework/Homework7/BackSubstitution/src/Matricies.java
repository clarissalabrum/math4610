import java.util.Scanner;
import java.util.Random;

public class Matricies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;

        System.out.println("What's the size of the matrix?");
        size = input.nextInt();

        double[][] A = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j >= i) {
                    A[i][j] = i + j -1;
                } else {
                    A[i][j] = 0;
                }
            }
        }

        double[] b = new double[size];
        for (int i = 0; i < size; i++) {
            b[i] = 1;
        }

//        printMatrix(A);
//        backSubstitution(A, b);
//        double[][] A2 = transpose(A);
//        printMatrix(A2);
//        forwardSubstitution(A2, b);
//
//        double[][] diag = diagMatrix(size);
//        printMatrix(diag);
//        diagSolver(diag, b);

        double[][] A3 = squareMatrix(size);
        printMatrix(A3);
        rowEchelon(A3, b);
    }

    public static void backSubstitution(double[][] A, double[] b){
        double[] x = new double[b.length];
        int lastIndex = b.length -1;
        x[lastIndex] = b[lastIndex]/A[lastIndex][lastIndex];
        for (int i = lastIndex - 1; i >= 0; i--) {
            double sum = b[i];
            for (int j = i+1; j <= lastIndex; j++) {
                sum = sum - A[i][j] * x[j];
            }
            x[i] = sum / A[i][i];
        }
        System.out.println("Solution:");
        for (double z : x) {
            System.out.println(z);
        }
    }

    public static void forwardSubstitution(double[][] A, double[] b){
        double[] x = new double[b.length];
        //int lastIndex = b.length -1;
        x[0] = b[0]/A[0][0];
        for (int i = 1; i < A.length; i++) {
            double sum = b[i];
            for (int j = 0; j < i; j++) {
                sum = sum - A[i][j] * x[j];
            }
            x[i] = sum / A[i][i];
        }
        System.out.println("Solution:");
        for (double z : x) {
            System.out.println(z);
        }
    }

    public static double[][] transpose(double[][] A) {
        double[][] AT = new double[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                AT[i][j] = A[j][i];
            }
        }
        return AT;
    }

    public static void printMatrix(double[][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.printf("%6.2f",A[i][j]);
            }
            System.out.println();
        }
    }

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

    public static double[][] upperMatrix(int size){
        double[][] A = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j >= i) {
                    A[i][j] = i + j -1;
                } else {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }

    public static double[][] lowerMatrix(int size){
        double[][] A = upperMatrix(size);
        return transpose(A);
    }

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

    static void diagSolver(double[][] A, double[] b){
        double[] x = new double[b.length];
        for (int i = 0; i < b.length; i++) {
            x[i] = b[i] / A[i][i];
        }
        System.out.println("Solution:");
        for (double z : x) {
            System.out.println(z);
        }
    }

    static void rowEchelon(double[][] A, double[] b){
        int size = b.length;
        for (int k = 0; k < size - 1; k++) { //column
            for (int i = k + 1; i < size; i++) {
                double factor = A[i][k]/A[k][k];
                for (int j = 0; j < size; j++) {
                    A[i][j] = A[i][j] - factor * A[k][j];
                }
                b[i] = b[i] -factor * b[k];
            }
        }
        System.out.println();
        System.out.println("Row Echelon Form");
        printMatrix(A);
        backSubstitution(A, b);
    }
}
