Results for initial guess -5

    Enter an Initial Guess:
      -5
    Enter the Desired Tolerance:
      .000001
    Enter the Max Number of Iterations:
      100
    Iteration: 1 Current Value = 3.169857900869032E8
    Iteration: 2 Current Value = -Infinity
    Iteration: 3 Current Value = NaN
    Iteration: 4 Current Value = NaN
    ...
    Iteration: 98 Current Value = NaN
    Iteration: 99 Current Value = NaN
    Iteration: 100 Current Value = NaN
    
Results for initial guess 6

    Enter an Initial Guess:
      6
    Enter the Desired Tolerance:
      .000001
    Enter the Max Number of Iterations:
      100
    Iteration: 1 Current Value = -1.4916475432417209E13
    Iteration: 2 Current Value = Infinity
    Iteration: 3 Current Value = NaN
    Iteration: 4 Current Value = NaN
    ...
    Iteration: 98 Current Value = NaN
    Iteration: 99 Current Value = NaN
    Iteration: 100 Current Value = NaN

Neither of these guesses result in finding a root. This is most likely because the majority of the roots are close to the origin and the farther out from the origin you go the slope of the function flattens out. Because the Newton method relies on the tanget of the graph at each point to pick a new point we are picking values that have flat slopes the next approximate value is farther off.
