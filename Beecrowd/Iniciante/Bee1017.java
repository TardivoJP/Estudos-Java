import java.util.Scanner;

public class Bee1017 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        double c = (double) (a*b)/12;
        System.out.printf("%.3f\n",c);
        s.close();
    }
}