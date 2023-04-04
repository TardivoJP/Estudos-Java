import java.util.Scanner;

public class Bee1006 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double A = -5;
        double B = -5;
        double C = -5;
        while(A<0 || A>10){
            A = s.nextDouble();
        }
        while(B<0 || B>10){
            B = s.nextDouble();
        }
        while(C<0 || C>10){
            C = s.nextDouble();
        }
        double MEDIA = ((2*A)+(3*B)+(5*C))/10;
        System.out.printf("MEDIA = %.1f\n",MEDIA);
        s.close();
    }
}