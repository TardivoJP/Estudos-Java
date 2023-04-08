import java.util.Scanner;

public class Bee2167 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = 0, y = 0;
		int result = 0;
		for(int i=0;i<n;i++){
			y = x;
			x = s.nextInt();
			if(x<y){
				result=i+1;
				break;
			}
		}
		System.out.println(result);
        s.close();
    }
}