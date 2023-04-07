import java.util.Scanner;

public class Bee1173 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int z = s.nextInt();
        int arr[] = new int [10];
        for(int i=0;i<10;i++){
            arr[i]=z;
            z*=2;
        }
        for(int i=0;i<10;i++){
            System.out.println("N["+i+"] = "+arr[i]);
        }
        s.close();
    }
}