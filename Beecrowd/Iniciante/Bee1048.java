import java.util.Scanner;

public class Bee1048 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();

        if(a<=400){
            System.out.printf("Novo salario: %.2f\n",a*1.15);
            System.out.printf("Reajuste ganho: %.2f\n",(a*1.15)-a);
            System.out.println("Em percentual: 15 %");
        }else if(a>400 && a<=800){
            System.out.printf("Novo salario: %.2f\n",a*1.12);
            System.out.printf("Reajuste ganho: %.2f\n",(a*1.12)-a);
            System.out.println("Em percentual: 12 %");
        }else if(a>800 && a<=1200){
            System.out.printf("Novo salario: %.2f\n",a*1.1);
            System.out.printf("Reajuste ganho: %.2f\n",(a*1.1)-a);
            System.out.println("Em percentual: 10 %");
        }else if(a>1200 && a<=2000){
            System.out.printf("Novo salario: %.2f\n",a*1.07);
            System.out.printf("Reajuste ganho: %.2f\n",(a*1.07)-a);
            System.out.println("Em percentual: 7 %");
        }else if(a>2000){
            System.out.printf("Novo salario: %.2f\n",a*1.04);
            System.out.printf("Reajuste ganho: %.2f\n",(a*1.04)-a);
            System.out.println("Em percentual: 4 %");
        }
        
        s.close();
    }
}