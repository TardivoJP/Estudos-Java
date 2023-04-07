import java.util.Scanner;

public class Bee1177 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int count = 0;
        int arr[] = new int [1000];
        for(int i=0;i<1000;i++){
            arr[i]=count;
            System.out.println("N["+i+"] = "+arr[i]);
            count++;
            if(count>=t){
                count=0;
            }
        }
        s.close();
    }
}