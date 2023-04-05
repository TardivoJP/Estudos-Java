import java.util.Scanner;

public class beee1060 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int contador = 0;
        double primeiro = 0;
        for(int i=1;i<=6;i++){
            primeiro = s.nextDouble();
            if(primeiro>0){
                contador++;
            }
        }
        System.out.println(contador+" valores positivos");
        s.close();
    }
    
}
