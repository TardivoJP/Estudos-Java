import java.util.Scanner;

public class Bee2061 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int abas = s.nextInt();
        int n = s.nextInt();
        for(int i=0;i<=n;i++){
            String option = s.nextLine();
            if(option.equals("fechou")){
                abas++;
            }
            if(option.equals("clicou")){
                abas--;
            }
        }
        System.out.println(abas);
        s.close();
    }
}