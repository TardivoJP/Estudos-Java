import java.util.Scanner;

public class Bee2787 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lines = s.nextInt();
        int columns = s.nextInt();
        if(lines % 2 == 0){
            if(columns % 2 == 0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }else{
            if(columns % 2 == 0){
                System.out.println(0);
            }else{
                System.out.println(1);
            }
        }
        s.close();
    }
}