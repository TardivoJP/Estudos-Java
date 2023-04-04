import java.util.Scanner;

public class Bee1014 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        double b = s.nextDouble();
        System.out.printf("%.3f km/l\n",a/b);
        s.close();
    }
}