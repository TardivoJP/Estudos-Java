import java.util.Scanner;

public class Bee2780 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int distance = s.nextInt();
        if(distance<=800){
            System.out.println(1);
        }else if(distance<=1400){
            System.out.println(2);
        }else{
            System.out.println(3);
        }
        s.close();
    }
}