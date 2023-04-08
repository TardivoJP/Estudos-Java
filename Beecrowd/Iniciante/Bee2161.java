import java.util.Scanner;

public class Bee2161 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double root = 0.0;
		for(int i=0;i<n;i++){
			root += 6.0;
			root = (1.0/root);
		}
		root+=3;
		System.out.printf("%.10f\n",root);
        s.close();
    }
}