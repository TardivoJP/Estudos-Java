import java.util.Scanner;

public class Bee1117 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double valores[] = new double[2];
        double teste=0;
        int valido = 0;
        while(valido!=2){
            teste = s.nextDouble();
            if(teste>=0 && teste<=10){
                valores[valido]=teste;
                valido++;
            }else{
                System.out.println("nota invalida");
            }
        }
        System.out.println("media = "+((valores[0]+valores[1])/2));
        s.close();
    }
}
