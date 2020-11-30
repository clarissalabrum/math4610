# Homework 5  

# Task 1

[Software Manuel for the Newtons Method](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework5/Newtons.md)

# Task 2

[Software Manuel for the Secant Method](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework5/Secant.md)

# Task 3

Below are the steps taken to do a computational convergence analysis on Newton's method.

![Newton Convergence](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework5/Newtons.png)

The equation in oranage is the regression line for the log(ek+1)-log(ek) relation. The slope is 3.1348 which would be the rate of convergence. It was expected to be a value close to 2.
The variation in the observed and expected might be due to the function used to solve the problem or maybe that it convereged too quickly that the analysis did not have enough points to 
give a good approximation.

# Task 4

Below are the steps taken to do a computational convergence analysis on the Secant method.

![Secant Method](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework5/Secant.png)

The rate of convergence using the given funtion and the secant method resulted in about 1.069 which is slightly off from the expected 1.62. This could possibly be due to the reasons listed for the Newtons method.

# Task 5

[Software Manuel for the Hybrid Method](https://github.com/clarissalabrum/math4610/blob/master/homework/Homework5/Hybrid.md)

# Task 6

I found this page very helpful in comparing the methods [https://arnold.hosted.uark.edu/NA/Pages/BisectSecantNewton.pdf](https://arnold.hosted.uark.edu/NA/Pages/BisectSecantNewton.pdf). Comparing the inputs, all three methods need the function but Newtons also needs the derivative. They all vary in the type of initial guess that they need but for best approximation the guesses should be close to the root. For convergence speed, Newtons is the fastest at 2 then secant at 1.62, and the Bisection at 1.
