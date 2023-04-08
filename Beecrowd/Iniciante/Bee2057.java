import java.util.Scanner;

public class Bee2057 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int calculus = a+b+c;
        if(calculus>23){
            calculus-=24;
        }else if(calculus<0){
            calculus+=24;
        }
        System.out.println(calculus);
        s.close();
    }
}