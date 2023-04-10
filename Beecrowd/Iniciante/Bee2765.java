import java.util.Scanner;

public class Bee2765 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String frase[] = s.nextLine().split("[,]");
        System.out.println(frase[0]);
        System.out.println(frase[1]);
        s.close();
    }
}