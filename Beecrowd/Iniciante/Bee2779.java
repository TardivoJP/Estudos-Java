import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bee2779 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set<Integer> uniqueNumbers = new HashSet<Integer>();
        int total = s.nextInt();
        int bought = s.nextInt();
        for (int i = 0; i < bought; i++) {
            int number = s.nextInt();
            uniqueNumbers.add(number);
        }
        System.out.println(total-uniqueNumbers.size());
        s.close();
    }
}