import java.util.Scanner;

public class Bee1959 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        System.out.println(Long.parseLong(arr[0])*Long.parseLong(arr[1]));
        s.close();
    }
}