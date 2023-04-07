import java.util.Scanner;

public class Bee1984 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split("");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[arr.length-1-i]);
        }
        System.out.println();
        s.close();
    }
}