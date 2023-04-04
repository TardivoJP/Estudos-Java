import java.util.Scanner;

public class Bee1118 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double x = -1;
        double m = 0;
        int count = 0;
        while(x!=2){
            x = s.nextDouble();
            if(x>=0||x<=10){
                m += x;
                count++;
                System.out.println(m/count);
            } else {
                System.out.println("Invalido");
            }
        }
        s.close();
    }
}
