import java.util.Scanner;

public class Bee2143 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	int x = 0;
    	while(n != 0){
    		for(int i=1;i<=n;i++){
    			x=s.nextInt();
    			if(x % 2 != 0){
                    System.out.println((x*2)-1);
                }else{
                    System.out.println((x*2)-2);
                }
    		}
    		n = s.nextInt();
    	}
        s.close();
    }
}