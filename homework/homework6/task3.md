### Here are the changes that I made to the code:

    //Bisection Portion
    if (fa * fc < 0) {
      b = c;
      fb = fc;
    } else if (fb * fc < 0) {
      a = c;
      fa = fc;
    } else {
      a += 1;
      b -= 1;
      fa = f(a);
      fb = f(b);
    }
