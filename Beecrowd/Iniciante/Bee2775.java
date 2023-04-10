import java.util.Scanner;

public class Bee2775 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()) {
            int N = s.nextInt();
            int[][] v = new int[N][2];
            for (int i = 0; i < N; i++) {
                v[i][0] = s.nextInt();
            }
            for (int i = 0; i < N; i++) {
                v[i][1] = s.nextInt();
            }
            int cost = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 1; j < N; j++) {
                    if (v[j-1][0] > v[j][0]) {
                        int[] temp = v[j-1];
                        v[j-1] = v[j];
                        v[j] = temp;
                        cost += v[j-1][1] + v[j][1];
                    }
                }
            }
            System.out.println(cost);
        }
        s.close();
    }
    static final int MAX = 1123;
}