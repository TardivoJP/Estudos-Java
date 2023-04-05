import java.util.Scanner;

public class Bee1114 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int senha = 2002;
        int input = 0;
        while(input!=senha){
            input=s.nextInt();
            if(input!=senha){
                System.out.println("Senha Invalida");
            }else{
                System.out.println("Acesso Permitido");
            }
        }
        s.close();
    }
}
