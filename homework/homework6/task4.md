Here are the changes that I made to the secant method.

    while (f(xold) * f(x) > 0) {
        xold += 1;
        x -= 1;
    }
    xnew = x - f(x) * (x- xold) / (f(x) - f(xold));
    error = Math.abs(xnew - xold);
    if (f(xnew) * f(x) < 0) {
        xold = xnew;
    } else x = xnew;
