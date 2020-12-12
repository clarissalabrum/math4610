# Homework 9

## Task 1

[Vector Additon](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/vectorAdditionSM.md)

[Vector Subtraction](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/vectorSubtractionSM.md)

[Scalar Multiplication](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/vectorScalarMultiplicationSM.md)

[Dot Product](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/vectorDotProductSM.md)

[Outer Product](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/vectorOuterProductSM.md)

## Task 2

[Magnitude - 1 Norm](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/Norms/mag1NormSM.md)

[Magnitude - 2 Norm](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/Norms/mag2NormSM.md)

[Magnitude - Infinity Norm](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/Norms/magInfinityNormSM.md)

[Error - 1 Norm](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/Norms/error1NormSM.md)

[Error - 2 Norm](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/Norms/error2NormSM.md)

[Error - Infinity Norm](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/Norms/errorInfinityNormSM.md)

## Task 3

[Matrix Addition](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/Matrices/matrixAdditionSM.md)

[Matrix Subtraction](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/Matrices/matrixSubtractionSM.md)

[Matrix Scalar Multiplication](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/Matrices/matrixScalarMultiplication)

[Transpose](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework7/Task2/transpose.md)

[Matrix Vector Multiplication](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework8/matrixVectorMultiplicationSM.md)

[Matrix Matrix Multiplication](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/Matrices/matrixMatrixMultiplicationSM.md)

## Task 4

[Jacobi Iteration(https://github.com/clarissalabrum/math4610/blob/master/homework/Homework9/jacobiSM.md)

## Task 5

I generated a 100 x 100 matrix and found the rhs by mutipling the matrix with a vector of ones and then I did the following to compare the two routines (jacobi and gauss-elimination). b is the vector of ones

    double[] jacob = jacobi(A, C);
    double[] gauss = rowEchelon(A, C);

    System.out.println("jacobi error");
    System.out.println(error2Norm(jacob, b));

    System.out.println("gauss error");
    System.out.println(error2Norm(gauss, b));
    
This printed out the following result

    jacobi error
    6.404862859193016E-9
    gauss error
    4.84062331475946E-16

## Task 6

I used this lecture, [https://www3.nd.edu/~zxu2/acms40390F12/Lec-7.3.pdf](https://www3.nd.edu/~zxu2/acms40390F12/Lec-7.3.pdf), to help me understand Jacobi and Gauss-Seidel iteration. The big difference is that Jacobi iteration finds the iteration solution before moving to the next iteration. Gauss-Seidel uses the new solution values as soon as they are available. The convergence to the solution is faster in Gauss-Seidel because it is using the most accraute values as soon as it can instead of waiting until the next iteration.
