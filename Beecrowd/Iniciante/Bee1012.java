import java.util.Scanner;

public class Bee1012 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double a,b,c;
        String tam1[] = s.nextLine().split(" ");
        a = Double.parseDouble(tam1[0]);
        b = Double.parseDouble(tam1[1]);
        c = Double.parseDouble(tam1[2]);
        System.out.printf("TRIANGULO: %.3f\n",(a*c)/2);
        System.out.printf("CIRCULO: %.3f\n",3.14159*Math.pow(c, 2));
        System.out.printf("TRAPEZIO: %.3f\n",((a+b)*c)/2);
        System.out.printf("QUADRADO: %.3f\n",Math.pow(b, 2));
        System.out.printf("RETANGULO: %.3f\n",a*b);
        s.close();
    }
}