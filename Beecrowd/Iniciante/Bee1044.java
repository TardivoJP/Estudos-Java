import java.util.Scanner;

public class Bee1044 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int maior,menor;
        maior=menor=0;
        boolean iguais = false;
        if(a>b){
            maior=a;
            menor=b;
        }else if(a<b){
            menor=a;
            maior=b;
        }else{
            iguais = true;
        }

        if(iguais){
            System.out.printf("Sao Multiplos\n");     
        } else if(maior % menor == 0){
            System.out.printf("Sao Multiplos\n");    
        }else{
            System.out.printf("Nao sao Multiplos\n");   
        }
        
        s.close();
    }
}