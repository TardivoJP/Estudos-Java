import java.util.Scanner;

public class Bee2159 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		double n = s.nextDouble();
		double min = n/Math.log(n);
		double max = 1.25506*min;
		System.out.printf("%.1f %.1f\n",min,max);
        s.close();
    }
}