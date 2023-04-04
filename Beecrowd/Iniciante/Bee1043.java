import java.util.Scanner;

public class Bee1043 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        if((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.printf("Perimetro = %.1f\n",a+b+c);
        }else{
            System.out.printf("Area = %.1f\n",((a+b)*c)/2);
        }
        
        s.close();
    }
}