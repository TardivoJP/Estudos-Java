import java.util.Scanner;

public class Bee1002 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double n = 3.14159;
        double R = s.nextDouble();
        double A = n*(Math.pow(R, 2));
        System.out.printf("A=%.4f\n",A);
        s.close();
    }
}