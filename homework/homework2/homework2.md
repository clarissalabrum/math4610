# Homework 2

## Task 1 

Choosing Java, I created a java program program [JustABunny.java](https://github.com/clarissalabrum/math4610/blob/master/homework/homework2/JustABunny/src/JustABunny.java) in response to the "It's only a bunny". 

To execute the code the following commands need to be used.

    javac JustABunny.java
    java JustABunny
    
Compilation: 

    public class JustABunny {
      public static void main(String[] args) {
        System.out.println("It's only a bunny");
        System.out.println("*BAD THINGS HAPPEN*");
        System.out.println("Well, it's always the same, I always tell them, " +
                "do they listen to me?");
      }
    }

## Task 2

README.md file for math4610 repository has been updated.

## Task 3 

Link to homework table of contents created and repository has been cloned on my local device.

## Task 4

Analysis can be found [here](https://github.com/clarissalabrum/math4610/blob/master/homework/homework2/sheet2task4.pdf)

## Task 5

The analysis for the second derivative can be found [here](https://github.com/clarissalabrum/math4610/blob/master/homework/homework2/sheet2task5.pdf).

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


## Task 6

There is probably an infinite number of finite difference approximations because there can be many points used in an approximations and you can grow the derivative as many times as desired. One thing that can be observed in these approximations is that the more points that are involved in the approximation the higher the rate of convergence is. Some examples for higher order derivatives can be found [here](https://github.com/clarissalabrum/math4610/blob/master/homework/homework2/higherOrder.png).

Source: [Computational Methods](https://slideplayer.com/slide/4619856/), [Numerical Differentiation](http://www.engineering.uco.edu/~aaitmoussa/Courses/ENGR3703/Chapter6/ch6.pdf)
