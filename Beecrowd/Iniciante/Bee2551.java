import java.util.Scanner;

public class Bee2551 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            double velmed = 0,recorde=0;;
            for(int i=0;i<n;i++){
                int duracao = s.nextInt();
                int distancia = s.nextInt();
                velmed = ((double)(((double)distancia)/((double)duracao)));
                if(velmed>recorde){
                    recorde=velmed;
                    System.out.println(i+1);
                }
            }
        }
        s.close();
    }
}