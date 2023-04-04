import java.util.Scanner;

public class Bee1065 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int c = 0;
        for(int i = 0; i<5; i++){
            int tmp = s.nextInt();
            if(tmp % 2 == 0){
                c++;
            }
        }
        System.out.println(c+" valores pares");
        s.close();
    }
}
