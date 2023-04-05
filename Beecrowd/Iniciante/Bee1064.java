import java.util.Scanner;

public class Bee1064 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int contador = 0;
        double primeiro = 0;
        double soma = 0;
        for(int i=1;i<=6;i++){
            primeiro = s.nextDouble();
            if(primeiro>0){
                contador++;
                soma+=primeiro;
            }
        }
        System.out.println(contador+" valores positivos");
        System.out.printf("%.1f\n",soma/contador);
        s.close();
    }
    
}
