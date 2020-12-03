# Homework 6

## Task 1

[Click here for the results of running the function on the 4 root finding routines.](https://github.com/clarissalabrum/math4610/blob/master/homework/homework6/task1.md)

## Task 2

[Click here to go to the test results and a comparison of the results](https://github.com/clarissalabrum/math4610/blob/master/homework/homework6/task2.md)

## Task 3

I changed the hybrid method so that when fa, fb, and fc are all positive or negative the interval will be made shorter. I changed it like this because the first c value is very close to the root we want. [Here are the changes made.](https://github.com/clarissalabrum/math4610/blob/master/homework/homework6/task3.md)

## Task 4

For the secant method I needed to do the same that I did in the hybrid method. I added a check so if the two ends of the interval are both positive or negative the interval will be shortened until one end has a different sign. [Here are the changes to the Secant Method.](https://github.com/clarissalabrum/math4610/blob/master/homework/homework6/task4.md)

## Task 5 

The Hybrid Method was modified so that the routine will locate all the roots in the function within the interval. Here is the [Software Manuel](https://github.com/clarissalabrum/math4610/blob/master/homework/homework6/ModifiedHybridMethodSM.md). Here are the results.

    Enter Lower Bound of Interval:
    -5
    Enter Upper Bound of Interval:
    6
    Enter the Desired Tolerance:
    .000001
    The roots within [-5.0,6.0] are:
    -1.72295
    -1.70511
    -1.32159
    -1.03577
    -0.48362
    0.48361
    1.03576
    1.32158
    1.7051
    1.72294
    
## Task 6

From what I observed, methods to finds all the roots of an equation is not very popular unless it is a polynomial. Here are some methods that I was able to find, [Aberth Method](https://en.wikipedia.org/wiki/Aberth_method), [Durand-Kerner Method](https://en.wikipedia.org/wiki/Durand%E2%80%93Kerner_method), [Secant Method for Multiple Roots](http://sites.science.oregonstate.edu/~gibsonn/Teaching/MTH351-020F09/Supplements/King.pdf). From what I dicovered in finding multiple roots, there is the approach of breaking the problem into smaller intervals and then applying a root finding method.
