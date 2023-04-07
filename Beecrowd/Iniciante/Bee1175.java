import java.util.Scanner;

public class Bee1175 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arr[] = new int [20];
        for(int i=0;i<20;i++){
            arr[i]=s.nextInt();
        }
        int aux=0;
        for(int i=0;i<10;i++){
            aux=arr[19-i];
            arr[19-i]=arr[i];
            arr[i]=aux;
        }
        for(int i=0;i<20;i++){
            System.out.println("N["+i+"] = "+arr[i]);
        }
        s.close();
    }
}