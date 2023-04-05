import java.util.Scanner;

public class Bee1065 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int contador = 0;
        int primeiro = 0;
        for(int i=1;i<=5;i++){
            primeiro = s.nextInt();
            if(primeiro % 2 == 0){
                contador++;
            }
        }
        System.out.println(contador+" valores pares");
        s.close();
    }
    
}
