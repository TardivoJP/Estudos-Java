import java.util.Scanner;

public class Bee2544 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int vezes = 0;
            while(n>1){
                n=n/2;
                vezes++;
            }
            System.out.println(vezes);
        }
        s.close();
    }
}