import java.util.Scanner;

public class Bee2715 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                int n = s.nextInt();
                long[] t = new long[n];
                for (int i = 0; i < n; i++) {
                    t[i] = s.nextLong();
                }
                long left_sum = t[0];
                long right_sum = 0;
                for (int i = 1; i < n; i++) {
                    right_sum += t[i];
                }
                long dif = Math.abs(right_sum - left_sum);
                for (int i = 1; i < n - 1; i++) {
                    left_sum += t[i];
                    right_sum -= t[i];
                    long new_dif = Math.abs(right_sum - left_sum);
                    if (new_dif < dif) {
                        dif = new_dif;
                    } else {
                        break;
                    }
                }
                System.out.println(dif);
            } catch (Exception e) {
                break;
            }
        }
        s.close();
    }
}