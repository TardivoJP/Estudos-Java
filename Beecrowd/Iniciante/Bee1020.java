import java.util.Scanner;

public class Bee1020 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int ano,mes,dia;
        ano = mes = dia = 0;
        int a = s.nextInt();
        while (a >= 365){
            ano++;
            a -=365;
        }
        while (a >= 30){
            mes++;
            a -=30;
        }
        while (a >= 1){
            dia++;
            a -=1;
        }
        System.out.println(ano+" ano(s)");
        System.out.println(mes+" mes(es)");
        System.out.println(dia+" dia(s)");
        s.close();
    }
}