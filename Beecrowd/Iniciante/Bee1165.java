import java.util.Scanner;

public class Bee1165 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for(int i=0;i<n;i++){
            int x = s.nextInt();
            int sum=0;
            for(int j=1;j<=x;j++){
                if(x % j == 0){
                    sum++;
                }
            }
            if(sum==2){
                System.out.println(x+" eh primo");
            }else{
                System.out.println(x+" nao eh primo");
            }
        }
        s.close();
    }
}