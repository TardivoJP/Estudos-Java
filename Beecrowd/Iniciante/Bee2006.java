import java.util.Scanner;

public class Bee2006 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int acertos = 0;
        for(int i=0;i<5;i++){
            int cha = s.nextInt();
            if(cha==n){
                acertos++;
            }
        }
        System.out.println(acertos);
        s.close();
    }
}