**Routine Name:** main.py  

**Author:** Clarissa Labrum

**Language:** Python

**Description/Purpose:** This routine will take in multiple expressions and add them to a single plot

**Input:** Start and End of interval, number of steps, and expressions for the graph

**Output:** Plot of the expressions

**Usage/Example:**

To use the routine that routine will be compiled and ran and then the following prompts will appear:

    Enter left endpoint of an interval:
    Enter right endpoint of an interval:
    Enter the number of points for graphing the expression:
    Enter the next expression (include np.) for f(x):
    Enter another equation? (Y/N)
    
After these prompts have been answers the routine will plot the expressions

**Implementation/Code:** The following is the code for main.py

      from matplotlib import pyplot as plt
      import numpy as np

      #
      # initialize two arrays to store the data in
      # ------------------------------------------
      #
      xpts = []
      ypts = []
      #
      # get the endpoints of the interval that defines the graphical domain
      # --------------------------------------------------------------------
      #
      xmin = input('Enter left endpoint of an interval:\n')
      xmin = float(xmin)
      xmax = input('Enter right endpoint of an interval:\n')
      xmax = float(xmax)
      #
      # get the number of points for graphing the expression given
      # ----------------------------------------------------------
      #
      nvals = input('Enter the number of points for graphing the expression:\n')
      nvals = int(nvals)
      delx = (xmax - xmin) / float(nvals)

      i = 0
      while i <= nvals:
          x = xmin + float(i) * delx
          xpts.append(x)
          i += 1
      #
      # now that the data is set up, we can do the graphics in the lines below
      # ----------------------------------------------------------------------
      #
      plt.xlim(xmin, xmax)
      #
      # loop over the number of expressions specified
      # ---------------------------------------------
      #
      expressions = []
      while True:
          expressions.append(input('Enter the next expression (include np.) for f(x):\n'))
          answer = input("Enter another equation? (Y/N)")
          if answer != "Y":
              break

      # loop over the points, evaluating the expression
      # -----------------------------------------------
      #

      for expression in expressions:
          i = 0
          while i <= nvals:
              x = xpts[i]
              ypts.append(eval(expression))
              i += 1
          #
          # plot the data using matplotlib.pyplot
          # -------------------------------------
          plt.plot(xpts, ypts, label=expression)
          ypts.clear()
      #
      # create labels for the two axes in the 2-d plot
      # ----------------------------------------------
      #
      plt.xlabel("X Axis")
      plt.ylabel("Y Axis")
      #
      # create a legend for the plot, if needed
      # ---------------------------------------
      #
      plt.legend()
      #
      # show the plot of the data
      # -------------------------
      #
      plt.show()


**Last Modified:** November/2020
