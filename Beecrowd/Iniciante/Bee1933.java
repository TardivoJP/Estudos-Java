import java.util.Scanner;

public class Bee1933 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        int c1 = Integer.parseInt(arr[0]);
        int c2 = Integer.parseInt(arr[1]);
        if(c1==c2){
            System.out.println(c1);
        }else if(c1>c2){
            System.out.println(c1);
        }else if(c2>c1){
            System.out.println(c2);
        }
        s.close();
    }
}