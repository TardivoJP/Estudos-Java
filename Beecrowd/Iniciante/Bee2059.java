import java.util.Scanner;

public class Bee2059 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int sum = b+c;

        if(d!=0 || e!=0){
            if(d==0 && e==1){
                System.out.println("Jogador 1 ganha!");
            }else if(d==1 && e==1){
                System.out.println("Jogador 2 ganha!");
            }else if(d==1 && e==0){
                System.out.println("Jogador 1 ganha!");
            }
        }else if(a == 1){
            if(sum % 2 == 0){
                System.out.println("Jogador 1 ganha!");
            }else{
                System.out.println("Jogador 2 ganha!");
            }
        }else{
            if(sum % 2 == 0){
                System.out.println("Jogador 2 ganha!");
            }else{
                System.out.println("Jogador 1 ganha!");
            }
        }

        s.close();
    }
}