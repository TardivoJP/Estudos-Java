import java.util.Scanner;

public class Bee1159 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x=1;
        while(x!=0){
            x = s.nextInt();
            if(x==0){
                break;
            }
            int count=0;
            int soma=0;

            while(count<5){
                if((x % 2 == 0)){
                    soma+=x;
                    count++;
                }
                x++;
            }
            System.out.println(soma);
        }
        s.close();
    }
}