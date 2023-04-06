import java.util.Scanner;

public class Bee1151 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<x;i++){
            if(i==x-1){
                System.out.println(a);    
            }else{
                System.out.print(a+" ");    
            }
            c=b+a;
            a=b;
            b=c;
        }
        s.close();
    }
}