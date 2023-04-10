import java.util.Scanner;

public class Bee2802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long result = calculateSegments(n);
        System.out.println(result);
        sc.close();
    }

    private static long calculateSegments(long n) {
        long r = ((n*(n-1)*(n-2)*(n-3))/24) + ((n*(n-1))/2) + 1;
        return r;
    }
}