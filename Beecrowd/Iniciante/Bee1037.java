import java.util.Scanner;

public class Bee1037 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        
        if(a<0 || a>100){
            System.out.printf("Fora de intervalo\n");      
        } else if(a>=0 && a<=25){
            System.out.printf("Intervalo [0,25]\n");    
        } else if(a>25 && a<=50){
            System.out.printf("Intervalo (25,50]\n");   
        } else if(a>50 && a<=75){
            System.out.printf("Intervalo (50,75]\n");   
        } else if(a>75 && a<=100){
            System.out.printf("Intervalo (75,100]\n");   
        }
        s.close();
    }
}