import java.util.Scanner;

public class Bee1005 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double A = -5;
        double B = -5;
        while(A<0 || A>10){
            A = s.nextDouble();
        }
        while(B<0 || B>10){
            B = s.nextDouble();
        }
        double MEDIA = ((3.5*A)+(7.5*B))/11;
        System.out.printf("MEDIA = %.5f\n",MEDIA);
        s.close();
    }
}