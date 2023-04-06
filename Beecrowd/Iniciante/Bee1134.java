import java.util.Scanner;

public class Bee1134 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int alcool,gasolina,diesel,input;
        alcool=gasolina=diesel=input=0;
        while(input!=4){
            input = s.nextInt();
            switch(input){
                case 1:alcool++;break;
                case 2:gasolina++;break;
                case 3:diesel++;break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
        s.close();
    }
    
}