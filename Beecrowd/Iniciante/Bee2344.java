import java.util.Scanner;

public class Bee2344 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int nota = s.nextInt();
        if(nota==0){
            System.out.println("E");
        }else if(nota<=35){
            System.out.println("D");
        }else if(nota<=60){
            System.out.println("C");
        }else if(nota<=85){
            System.out.println("B");
        }else if(nota<=100){
            System.out.println("A");
        }
        s.close();
    }
}