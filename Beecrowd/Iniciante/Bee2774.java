import java.util.ArrayList;
import java.util.Scanner;

public class Bee2774 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int h = s.nextInt();
            int m = s.nextInt();

            ArrayList<Double> v = new ArrayList<>();
            double d, sa, sum = 0.0, mean, qt = 0.0, del;

            s.nextLine(); // clear the input buffer
            String[] input = s.nextLine().split(" ");
            for (String str : input) {
                d = Double.parseDouble(str);
                v.add(d);
                sum += d;
            }

            mean = sum / v.size();
            for (int i = 0; i < v.size(); ++i) {
                sa = v.get(i) - mean;
                qt += Math.pow(sa, 2);
            }

            del = qt / (v.size() - 1);
            del = Math.sqrt(del);

            System.out.printf("%.5f%n", del);
        }
        s.close();
    }
}