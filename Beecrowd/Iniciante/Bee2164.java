import java.util.Scanner;

public class Bee2164 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		double n = s.nextDouble();
		double quickFib = (Math.pow(((1.0+Math.sqrt(5.0))/2.0), n)-Math.pow(((1.0-Math.sqrt(5.0))/2.0), n))/Math.sqrt(5.0);
		System.out.printf("%.1f\n",quickFib);
        s.close();
    }
}