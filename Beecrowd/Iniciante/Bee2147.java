import java.util.Scanner;

public class Bee2147 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for(int i=0;i<n;i++){
			String palavra[] = s.nextLine().split("");
			System.out.printf("%.2f\n",palavra.length*0.01);
		}
        s.close();
    }
}