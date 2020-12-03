import java.util.ArrayList;

public class Method {
    double tol;
    double a, b;
    ArrayList<Double> roots;

    public Method(double a, double b, double tol){
        roots = new ArrayList<>();
        this.a = a;
        this.b = b;
        this.tol = tol;
        bisection(a, b, tol);
    }

    public ArrayList<Double> getRoots() {
        return roots;
    }

    public static double f(double x){
        return Math.exp(-1 * x * x) * Math.sin(4 * x * x - 1) + .051;
    }
    public static double d(double x){
        return -2 * x * Math.exp(-1*x*x) * (Math.sin(4*x*x - 1) - 4 * Math.cos(4*x*x-1));
    }

    public void bisection(double low, double up, double tol){
        if (up -low < .1) {
            newtons(low, tol);
            return;
        }
        double c = (up + low) / 2;
        bisection(low, c, tol);
        bisection(c, up, tol);
    }

    public void newtons(double c, double tol){
        double error = 10 * tol;
        int maxiter = 10;
        int iter = 0;
        while (error > tol && maxiter > iter){
            double xnew;
            xnew = c - f(c) / d(c);
            error = Math.abs(xnew- c);
            iter++;
            if (iter == maxiter) return;
            c = xnew;
        }
        if (!Double.isNaN(c)) {
            c = Math.floor(c * 100000) / 100000;
            if (!roots.contains(c)) {
                roots.add(c);
            }
        }
    }
}
