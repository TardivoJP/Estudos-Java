import java.util.Scanner;

public class Bee1004 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int PROD = A * B;
        System.out.printf("PROD = %d\n",PROD);
        s.close();
    }
}
