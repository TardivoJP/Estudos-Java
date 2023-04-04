import java.util.Scanner;

public class Bee1011 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double R = s.nextDouble();
        System.out.printf("VOLUME = %.3f\n",Math.pow(R, 3)*3.14159*4/3);
        s.close();
    }
}