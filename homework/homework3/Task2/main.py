# importing the required module
import matplotlib.pyplot as plt
import numpy as np
import math

file = open("../data.txt")

xpts=[]
ypts=[]
logxpts=[]
logypts=[]

xpts, ypts = np.loadtxt(file, delimiter=',', unpack=True)

file.close()

for x in xpts:
    logxpts.append(math.log(math.fabs(x),10))
for y in ypts:
    logypts.append(math.log(math.fabs(y),10))

xmin = np.min(logxpts)
xmax = np.max(logxpts)

plt.xlim(xmin, xmax)

plt.plot(logxpts, logypts, label='log-log plot of the error for cos(2)')

plt.xlabel("Increment Values: h")

plt.ylabel("Error in the Approximation")

plt.title("Error in the Difference Quotient of the Derivative")

plt.legend()
#plt.legend("log-log plot of the error for cos(2)")

plt.show()
