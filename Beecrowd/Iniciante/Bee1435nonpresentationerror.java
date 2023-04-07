import java.util.Scanner;

public class Bee1435nonpresentationerror {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
    	int N = s.nextInt();
    	int x;
    	while (N != 0) {
    		for (int i = 1; i <= N; i++) {
    			for (int j = 1 ; j <= N; j++) {
    				x = i;
                    if (j < x) x = j;
                    if (N-i+1 < x) x = N-i+1;
                    if (N-j+1 < x) x = N-j+1;
                    
                    System.out.printf("%3d", x);
                    if (j < N) System.out.print(" ");
                    else System.out.print("\n");
                }
            }
            System.out.print("\n");
            N = s.nextInt();
        }
        s.close();
    }
}