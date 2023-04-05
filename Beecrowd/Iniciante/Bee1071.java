import java.util.Scanner;

public class Bee1071 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int maior,menor;
        int x = s.nextInt();
        maior = x;
        int y = s.nextInt();
        menor = y;
        int soma = 0;
        if(x>y){
            maior=x;
            menor=y;
        }else{
            maior=y;
            menor=x;
        }
        for(int i = menor+1; i<maior; i++){
            if(!(i % 2 == 0)){
                soma+=i;
            }
        }
        System.out.println(soma);
        s.close();
    }
}
