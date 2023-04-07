import java.util.Scanner;

public class Bee1178 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double t = s.nextDouble();
        double arr[] = new double [100];
        for(int i=0;i<100;i++){
            arr[i]=t;
            System.out.printf("N[%d] = %.4f\n",i,arr[i]);
            t=t/2;
        }
        s.close();
    }
}