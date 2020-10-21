# Homework 3

## Task 1

Verification that the central difference approximation for the second derivative approximation defined in Task Sheet 2, Task 5 is second order accurate [is found here](https://github.com/clarissalabrum/math4610/blob/master/homework/homework2/sheet2task5.pdf).

The code that runs the approximation can be found [here](https://github.com/clarissalabrum/math4610/blob/master/homework/homework2/Task5/src/Task5.java).

The results of the program:

    exact: 0.4161468365471424
    iter    h          approx       diff
    0    1.00e+00    3.83e-01   3.35e-02
    1    5.00e-01    4.08e-01   8.60e-03
    2    1.00e-01    4.16e-01   3.47e-04
    3    1.00e-02    4.16e-01   3.47e-06
    4    1.00e-03    4.16e-01   3.46e-08
    5    1.00e-04    4.16e-01   1.95e-08
    6    1.00e-05    4.16e-01  -2.80e-07
    7    1.00e-06    4.16e-01   1.46e-04
    8    1.00e-07    4.39e-01  -2.24e-02
    9    1.00e-08    1.11e+00  -6.94e-01
    10   1.00e-09    5.55e+01  -5.51e+01
    11   1.00e-10    5.55e+03  -5.55e+03
    12   1.00e-11    5.55e+05  -5.55e+05
    13   1.00e-12    0.00e+00   4.16e-01
    14   1.00e-13    5.55e+09  -5.55e+09
    15   1.00e-14   -1.67e+12   1.67e+12
    16   1.00e-15    2.78e+14  -2.78e+14
    17   1.00e-16    0.00e+00   4.16e-01

## Task 2

The following plot shows the log-log relationship between the increment values and the error in the approximation. The slope of the points, where the h value is small and results are not effected by the precision, is very close to 2. The slope of this approximation represents the the order of accuracy. Therefore the accuracy of the approximation is close to second order.

![Task 2 plot](https://github.com/clarissalabrum/math4610/blob/master/homework/homework3/Task.png)

As shown above the approximation begins to fail around h = 1x10^-4.

The code for the plot can be found [here](https://github.com/clarissalabrum/math4610/blob/master/homework/homework3/Task2/main.py)

## Task 3

[Single Precision Code](https://github.com/clarissalabrum/math4610/blob/master/homework/homework3/Task3/precsion/src/SinglePrecision.java)

    Output: 1.1920929E-7

[Double Precision Code](https://github.com/clarissalabrum/math4610/blob/master/homework/homework3/Task3/precsion/src/DoublePrecision.java)

    Output: 2.220446049250313E-16

