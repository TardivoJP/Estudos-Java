import java.util.Scanner;

public class Bee1080 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int maior,posicao,atual;
        maior=posicao=atual=0;
        for(int i=1;i<=100;i++){
            atual = s.nextInt();
            if(i==1){
                maior=atual;
                posicao=i;
            }
            if(atual>maior){
                maior=atual;
                posicao=i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
        s.close();
    }
}
