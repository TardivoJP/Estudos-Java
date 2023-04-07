import java.util.Scanner;

public class Bee1589 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        for(int i=0;i<t;i++){
            String arr[] = s.nextLine().split(" ");
            int a=Integer.parseInt(arr[0]);
            int b=Integer.parseInt(arr[1]);
            int sum=a+b;
            System.out.println(sum);
        }
        s.close();
    }
}