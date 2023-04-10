import java.util.Arrays;
import java.util.Scanner;

public class Bee2769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            N = sc.nextInt();
            e = new int[2];
            x = new int[2];
            a = new int[2][MAX];
            t = new int[2][MAX];
            pd = new int[2][MAX];
            Arrays.stream(pd).forEach(a -> Arrays.fill(a, -1));
            for (int i = 0; i < 2; i++) {
                e[i] = sc.nextInt();
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 1; j <= N; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 1; j < N; j++) {
                    t[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < 2; i++) {
                x[i] = sc.nextInt();
            }
            System.out.println(Math.min(solve(0, 0), solve(1, 0)));
        }
        sc.close();
    }
    
    static final int MAX = 1123;
    static int N, e[], x[], a[][], t[][], pd[][];
    static int solve(int i, int j) {
        if (pd[i][j] != -1)
            return pd[i][j];
        if (j == N)
            return pd[i][j] = a[i][j] + x[i];
        if (j == 0)
            return pd[i][j] = e[i] + solve(i, j + 1);
        return pd[i][j] = a[i][j] + Math.min(solve(i, j + 1), t[i][j] + solve(1 - i, j + 1));
    }    
}