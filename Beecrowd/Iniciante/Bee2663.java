import java.util.Arrays;
import java.util.Scanner;

public class Bee2663{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = s.nextInt();
        }
        Arrays.sort(scores);
        int numPassing = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (scores[i] >= scores[n - x]) {
                numPassing++;
            }
        }
        System.out.println(numPassing);
        s.close();
    }
}