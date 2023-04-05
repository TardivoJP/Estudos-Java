import java.util.Scanner;

public class Bee1118 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double valores[] = new double[2];
        double teste=0;
        int selecao,valido;
        selecao=valido=0;
        while(valido!=2){
            teste = s.nextDouble();
            if(teste>=0 && teste<=10){
                valores[valido]=teste;
                valido++;
            }else{
                System.out.println("nota invalida");
            }
            if(valido==2){
                System.out.printf("media = %.2f\n",((valores[0]+valores[1])/2));
                while(selecao!=1&&selecao!=2){
                    System.out.println("novo calculo (1-sim 2-nao)");
                    selecao=s.nextInt();
                }
                if(selecao==1){
                    valido=0;
                    selecao=0;
                }
            }
        }
        s.close();
    }
}
