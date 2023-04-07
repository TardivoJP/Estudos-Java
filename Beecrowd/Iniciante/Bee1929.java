import java.util.Scanner;

public class Bee1929 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        double a = Double.parseDouble(arr[0]);
        double b = Double.parseDouble(arr[1]);
        double c = Double.parseDouble(arr[2]);
        double d = Double.parseDouble(arr[3]);

        if(((a+b)>c && (a+c)>b && (b+c)>a) || ((a+b)>d && (a+d)>b && (b+d)>a) || ((d+b)>c && (d+c)>b && (b+c)>d) || ((a+d)>c && (a+c)>d && (d+c)>a)){
            System.out.printf("S\n");
        }else{
            System.out.printf("N\n");
        }
        
        s.close();
    }
}