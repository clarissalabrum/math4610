# Homework 4

## Task 1

[RelativeError](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework4/RelativeErrorSM.md)

[AbsoluteError](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework4/AbsoluteErrorSM.md)

## Task 2

[Plot Multiple Expressions](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework4/PlotSM.md)

## Task 3

[Fixed Point Iteration](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework4/FixedPoint.md)

## Task 4 

Testing Fixed Point Iteration

Test using x = x - f(x)

    Enter approximate x: 
    .001
    Desired tolerance: 
    .001
    Maximum Iterations: 
    100
    Iteration: 1 Current Value = -0.0049999969999955
    Iteration: 2 Current Value = 0.024999609986589687
    Iteration: 3 Current Value = -0.1249511331573792
    Iteration: 4 Current Value = 0.6187639339266904
    Iteration: 5 Current Value = -1.7611291427030589
    Iteration: 6 Current Value = -19343.981688243683
    Iteration: 7 Current Value = -Infinity
    Iteration: 8 Current Value = NaN
    Iteration: 9 Current Value = NaN
    ...
    Iteration: 99 Current Value = NaN
    Iteration: 100 Current Value = NaN
    Method Failed after: 100
    
Test using x = x - .2f(x)

    Enter approximate x: 
    .5
    Desired tolerance: 
    .00000000001
    Maximum Iterations: 
    100
    Iteration: 1 Current Value = 0.011700001661267445
    Iteration: 2 Current Value = -0.0023390391666966714
    Iteration: 3 Current Value = 4.6780015500008307E-4
    ...
    Iteration: 14 Current Value = -9.580540622593756E-12
    Iteration: 15 Current Value = 1.916108124518752E-12
    X: -3.8322162490375037E-13
    
## Task 5

[Bisection Method](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework4/Bisection.md)

Testing this method with the equation from task 4:

    Enter Lower Bound of Interval:
    -.5
    Enter Upper Bound of Interval:
    .5
    Enter the Desired Tolerance:
    .00000001
    X: -7.450580596923828E-9
    
## Task 6

I found documentation titled [Numerical Solution of Root-Finding Problem](http://www.math.niu.edu/~dattab/math435.2009/ROOT-FINDING.pdf). This documentation was really interesting because it lists different methods that we have covered in class as well as other methods I have never heard of. The documentation went further in detail about how these methods works which is very helpful. It is interesting how many ways there is to find a solution to root finding problems and how it is applicable to many different types of problems.

    
    
