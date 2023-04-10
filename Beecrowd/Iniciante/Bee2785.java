import java.util.Arrays;
import java.util.Scanner;

public class Bee2785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= N; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 1; j <= N; j++) {
                matriz[i][j] = Integer.parseInt(line[j - 1]);
                soma[i][j] = soma[i][j - 1] + matriz[i][j];
            }
        }
        sc.close();
        for (int i = 0; i <= N; i++)
            Arrays.fill(dp[i], -1);
        int resposta = solve(1, 1);
        for (int i = 2; i <= N; i++)
            resposta = Math.min(resposta, solve(1, i));
        System.out.println(resposta);
    }

    static final int MAXN = 1000 + 10;
    static final int INF = 1000000000;
    static int[][] soma = new int[MAXN][MAXN];
    static int[][] matriz = new int[MAXN][MAXN];
    static int[][] dp = new int[MAXN][MAXN];
    static int N;

    static int calcula(int id, int a, int b) {
        return soma[id][b] - soma[id][a - 1];
    }

    static int solve(int linha, int pos) {
        if (linha == N + 1)
            return 0;
        if (dp[linha][pos] != -1)
            return dp[linha][pos];
        if (pos <= 0 || linha + pos - 1 > N)
            return dp[linha][pos] = INF;
        int agora = calcula(linha, pos, pos + linha - 1);
        int proxima = Math.min(solve(linha + 1, pos - 1), solve(linha + 1, pos));
        return dp[linha][pos] = agora + proxima;
    }
}