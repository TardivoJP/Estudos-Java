import java.util.Scanner;

public class Bee1051 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double total = 0;
        double atual = a;

        if(a<=2000){
            System.out.println("Isento");
        }else{
            if(a>4500){
                total+=((atual-4500)*1.28)-(atual-4500);
                atual=4500;
            }
            if(a>3000){
                total+=((atual-3000)*1.18)-(atual-3000);
                atual=3000;
            }
            if(a>2000){
                total+=((atual-2000)*1.08)-(atual-2000);
            }
            System.out.printf("R$ %.2f\n",total);
        }

        s.close();
    }
}
