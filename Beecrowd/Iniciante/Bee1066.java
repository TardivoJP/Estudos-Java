import java.util.Scanner;

public class Bee1066 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int primeiro,contadorpar,contadorimpar,contadorpos,contadorneg;
        contadorpar=contadorimpar=contadorpos=contadorneg=primeiro=0;
        for(int i=1;i<=5;i++){
            primeiro = s.nextInt();
            if(primeiro<0){
                contadorneg++;
            }else if(primeiro>0){
                contadorpos++;
            }
            if(primeiro % 2 == 0){
                contadorpar++;
            }else{
                contadorimpar++;
            }
        }
        System.out.println(contadorpar+" valor(es) par(es)");
        System.out.println(contadorimpar+" valor(es) impar(es)");
        System.out.println(contadorpos+" valor(es) positivo(s)");
        System.out.println(contadorneg+" valor(es) negativo(s)");
        s.close();
    }
    
}
