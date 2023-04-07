import java.util.Scanner;

public class Bee1541 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = 1;
        while(x!=0){
            String arr[] = s.nextLine().split(" ");
            if(arr.length==1){
                break;
            }
            double a=Double.parseDouble(arr[0]);
            double b=Double.parseDouble(arr[1]);
            double c=Double.parseDouble(arr[2]);
            double result = Math.sqrt((((a*b)/c)*100));
            System.out.println((int)result);
        }
        s.close();
    }
}