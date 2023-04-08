import java.util.Scanner;

public class Bee2234 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		double media = a/b;
		System.out.printf("%.2f\n",media);
        s.close();
    }
}