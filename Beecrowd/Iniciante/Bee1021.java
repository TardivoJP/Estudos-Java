import java.util.Scanner;

public class Bee1021 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        int cont = 0;
        System.out.printf("NOTAS: \n");
        while(a >= 100){
            cont++;
            a -= 100;
        }
        System.out.printf("%d nota(s) de R$ 100.00 \n",cont);
        cont = 0;
        while(a >= 50){
            cont++;
            a -= 50;
        }
        System.out.printf("%d nota(s) de R$ 50.00 \n",cont);
        cont = 0;
        while(a >= 20){
            cont++;
            a -= 20;
        }
        System.out.printf("%d nota(s) de R$ 20.00 \n",cont);
        cont = 0;
        while(a >= 10){
            cont++;
            a -= 10;
        }
        System.out.printf("%d nota(s) de R$ 10.00 \n",cont);
        cont = 0;
        while(a >= 5){
            cont++;
            a -= 5;
        }
        System.out.printf("%d nota(s) de R$ 5.00 \n",cont);
        cont = 0;
        while(a >= 2){
            cont++;
            a -= 2;
        }
        System.out.printf("%d nota(s) de R$ 2.00 \n",cont);
        System.out.printf("MOEDAS: \n");
        cont = 0;
        while(a >= 1){
            cont++;
            a -= 1;
        }
        System.out.printf("%d moeda(s) de R$ 1.00 \n",cont);
        cont = 0;
        while(a >= 0.5){
            cont++;
            a -= 0.5;
        }
        System.out.printf("%d moeda(s) de R$ 0.50 \n",cont);
        cont = 0;
        while(a >= 0.25){
            cont++;
            a -= 0.25;
        }
        System.out.printf("%d moeda(s) de R$ 0.25 \n",cont);
        cont = 0;
        while(a >= 0.1){
            cont++;
            a -= 0.1;
        }
        System.out.printf("%d moeda(s) de R$ 0.10 \n",cont);
        cont = 0;
        while(a >= 0.05){
            cont++;
            a -= 0.05;
        }
        System.out.printf("%d moeda(s) de R$ 0.05 \n",cont);
        cont = 0;
        while(a >= 0.01){
            cont++;
            a -= 0.01;
        }
        System.out.printf("%d moeda(s) de R$ 0.01 \n",cont);
        s.close();
    }
}