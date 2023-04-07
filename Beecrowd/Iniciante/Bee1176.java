import java.util.Scanner;

public class Bee1176 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        long y= s.nextLong();
        for(int j=0;j<y;j++){
            long x= s.nextInt();
            long a=0;
            long b=1;
            long c=0;
            for(int i=0;i<x;i++){
                c=b+a;
                a=b;
                b=c;
            }
            System.out.println("Fib("+x+") = "+a);
        }
        s.close();
    }
}