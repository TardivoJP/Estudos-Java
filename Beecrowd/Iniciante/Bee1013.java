import java.util.Scanner;

public class Bee1013 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        int ab = Bee1013.maior(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        int bc = Bee1013.maior(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));

        System.out.printf("%d eh o maior\n",Bee1013.maior(ab,bc));     
        s.close();
    }

    public static int maior(int a,int b){
        return (a+b+Math.abs(a-b))/2;
    }
}
