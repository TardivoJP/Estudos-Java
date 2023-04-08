import java.util.Scanner;

public class Bee2172 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long monster = s.nextLong();
		while(n!=0 && monster !=0){
			long result = n*monster;
			System.out.println(result);
			n = s.nextInt();
			monster = s.nextLong();
		}
        s.close();
    }
}