import java.util.Scanner;

public class Bee1143 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        double a,b,c;
        a=b=c=1;
        for(int i=0;i<n;i++){
            System.out.printf("%.0f ",a);
            System.out.printf("%.0f ",b);
            System.out.printf("%.0f\n",c);
            a++;
            b=Math.pow(a,2);
            c=Math.pow(a,3);
        }
        s.close();
    }
}