import java.util.Scanner;

public class Bee1144 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        double a,b,c;
        a=b=c=1;
        for(int i=0;i<n*2;i++){
            System.out.printf("%.0f ",a);
            System.out.printf("%.0f ",b);
            System.out.printf("%.0f\n",c);
            if(i % 2 != 0){
                a++;
                b=Math.pow(a,2);
                c=a*b;
            }else{
                b++;
                c++;
            }
        }
        s.close();
    }
}