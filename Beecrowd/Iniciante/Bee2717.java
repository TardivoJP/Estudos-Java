import java.util.Scanner;

public class Bee2717 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        if(a+b>n){
            System.out.println("Deixa para amanha!");
        }else{
            System.out.println("Farei hoje!");
        }
        s.close();
    }
}