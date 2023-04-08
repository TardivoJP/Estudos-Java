import java.util.Scanner;

public class Bee2165 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		String input[]=s.nextLine().split("");
		if(input.length<=140){
			System.out.println("TWEET");
		}else{
			System.out.println("MUTE");
		}
        s.close();
    }
}