import java.util.Scanner;

public class Bee2718 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        for(int i=0;i<n;i++){
            long x = Long.parseLong(s.next());
            System.out.println(countConsecutiveOnes(x));
        }
        s.close();
    }

    public static long countConsecutiveOnes(long n) {
        long count = 0;
        long maxCount = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
            n >>= 1;
        }
        return maxCount;
    }
}