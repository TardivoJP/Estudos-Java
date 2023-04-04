import java.util.Scanner;

public class Bee1019 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(a/3600+":"+(a/60)%60+":"+a%60);
        s.close();
    }
}