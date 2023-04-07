import java.util.Scanner;

public class Bee1172 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arr[] = new int [10];
        for(int i=0;i<10;i++){
            arr[i]=s.nextInt();
            if(arr[i]<=0){
                arr[i]=1;
            }
        }
        for(int i=0;i<10;i++){
            System.out.println("X["+i+"] = "+arr[i]);
        }
        s.close();
    }
}