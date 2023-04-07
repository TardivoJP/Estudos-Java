import java.util.Scanner;

public class Bee1866 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            int x = s.nextInt();
            if(x % 2 == 0){
                System.out.println(0);
            }else{
                System.out.println(1);
            }
        }
        s.close();
    }
}