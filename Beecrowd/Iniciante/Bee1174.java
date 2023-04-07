import java.util.Scanner;

public class Bee1174 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double arr[] = new double [100];
        for(int i=0;i<100;i++){
            arr[i]=s.nextDouble();
        }
        for(int i=0;i<100;i++){
            if(arr[i]<=10){
                System.out.printf("A[%d] = %.1f\n",i,arr[i]);
            }
        }
        s.close();
    }
}