import java.util.Scanner;

public class Bee1930 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1])+Integer.parseInt(arr[2])+Integer.parseInt(arr[3])-3);
        s.close();
    }
}