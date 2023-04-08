import java.util.Scanner;

public class Bee2160 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		String input[]=s.nextLine().split("");
		if(input.length<=80){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
        s.close();
    }
}