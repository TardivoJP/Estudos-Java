import java.util.Scanner;

public class Bee1957 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int hex = s.nextInt();
        System.out.println(Integer.toHexString(hex).toUpperCase());
        s.close();
    }
}