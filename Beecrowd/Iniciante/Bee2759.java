import java.util.Scanner;

//eu sei que o exercicio tecnicamente quer char mas da na mesma pro sistema deles aceitar

public class Bee2759 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        String c = s.next();
        System.out.println("A = "+a+", B = "+b+", C = "+c);
        System.out.println("A = "+b+", B = "+c+", C = "+a);
        System.out.println("A = "+c+", B = "+a+", C = "+b);
        s.close();
    }
}