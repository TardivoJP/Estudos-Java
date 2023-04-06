import java.util.Scanner;

public class Bee1150 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int soma=0;
        int count=0;
        int y=x;
        do {
            y= s.nextInt();     
        } while(!(y>x));
        x++;
        while(soma<y){
            soma+=x;
            count++;
        }
        System.out.println(count);
        s.close();
    }
}