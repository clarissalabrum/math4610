# Homework 8

## Task 1 

I created a [gaussian elimination](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework7/Task5/rowEchelon.md) routine and a 
[back substitution](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework7/Task1/backSubstitutionsSM.md) routine.

Here is the result of testing it on a diagonally dominant matrix with a b vector of ones. (Ax = b)

    Square matrix of size 3
    10.00  3.00  4.00
    1.00  4.00  4.00
    2.00  6.00  9.00

    Row Echelon Form
    10.00  3.00  4.00
    0.00  3.70  3.60
    0.00  0.00  2.95

    Solution:
    0.045871559633027505
    0.41284403669724773
    -0.17431192660550457

## Task 2 

Created a [LU Decomposition](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework8/LUDecompSM.md) routine to solve a system of linear equations.

## Task 3

For task three I wrote a [Hilbert Matrix](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework8/hilbertMatrixSM.md) routine and a [Matrix Vector Multiplication](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework8/matrixVectorMultiplicationSM.md) routine.

[Here](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework8/Task3Results.md) are the results of the LU decompositions on Hilbert Matrices of size 4-10.

## Task 4

I created this code [Pivoting Gaussian Elimination](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework8/pivotingGaussEliminationSM.md).

## Task 5

[Here](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework8/Task5Results.md) are the results of running the pivoting gaussian elimination on the Hilbert Matrices of varying sizes.

## Task 6

[On the determinant of the Hilbert matrix](https://blogs.sas.com/content/iml/2014/04/16/the-hilbert-matrix-det.html) by Rick Wicklin was very useful in understanding Hilbert 
Matrices. I learned that the inverse and the determinent of Hilbert Matrices have explicit formulas. The matrix is also ill-conditioned for smaller sized matrices but as the 
matrix grows the determinant of the matrix will head towards zero.
