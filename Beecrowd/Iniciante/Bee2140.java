import java.util.Scanner;

public class Bee2140 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(true){
            int valorCompra = s.nextInt();
            int valorPago = s.nextInt();
            if(valorCompra==0 && valorPago==0){
                break;
            }
            int cont = 0;
            int a = valorPago-valorCompra;
            while(a >= 100){
                cont++;
                a -= 100;
            }
            while(a >= 50){
                cont++;
                a -= 50;
            }
            while(a >= 20){
                cont++;
                a -= 20;
            }
            while(a >= 10){
                cont++;
                a -= 10;
            }
            while(a >= 5){
                cont++;
                a -= 5;
            }
            while(a >= 2){
                cont++;
                a -= 2;
            }
            while(a >= 1){
                cont++;
                a -= 1;
            }
            if(cont==2){
                System.out.println("possible");
            }else{
                System.out.println("impossible");
            }
        }
        s.close();
    }
}