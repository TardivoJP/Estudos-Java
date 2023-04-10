import java.util.Scanner;

public class Bee2786 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int L, C, S1, S2;
        L = s.nextInt();
        C = s.nextInt();
        S1 = (L*C)+((L-1)*(C-1));
        S2 = ((L-1)*2)+((C-1)*2);
        System.out.println(S1);
        System.out.println(S2);
        s.close();
    }
}