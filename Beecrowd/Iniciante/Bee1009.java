import java.util.Scanner;

public class Bee1009 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();
        double salario = s.nextDouble();
        double vendas = s.nextDouble();
        double salary = salario + (vendas*0.15);
        System.out.printf("TOTAL = R$ %.2f\n",salary);
        s.close();
    }
}