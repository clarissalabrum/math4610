import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        //get h values
        ArrayList<Double> h = new ArrayList<Double>();
        h.add(1.0);
        h.add(.5);
        h.add(.1);
        for (int i = 0; i < 15; i++) {
            h.add(h.get(2+i)/10);
        }

        ArrayList<Double> approx = new ArrayList<>();
        for (int i = 0; i < h.size(); i++) {
            approx.add((Math.cos(2+h.get(i)) - 2*Math.cos(2) +
                    Math.cos(2-h.get(i)))/ (h.get(i)*h.get(i)));
        }

        double exact = -1*Math.cos(2);

        ArrayList<Double> diff = new ArrayList<>();
        for (int i = 0; i < h.size(); i++) {
            diff.add(exact - approx.get(i));
        }

        System.out.println("exact: " + exact);
        System.out.printf("%-10s%-10s%-10s\n", "h", "approx", "diff");
        for (int i = 0; i < h.size(); i++) {
            System.out.printf("%-10.2e%-10.2e%-10.2e\n", h.get(i), approx.get(i),
                    diff.get(i));
        }
    }
}
