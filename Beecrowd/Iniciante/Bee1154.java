import java.util.Scanner;

public class Bee1154 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int idade=5;
        int i=0;
        double soma=0;
        while(idade>0){
            idade=s.nextInt();
            if(idade>0){
                soma+=idade;
                i++;    
            }
        }
        soma=soma/i;
        System.out.printf("%.2f\n",soma);
        s.close();
    }
}