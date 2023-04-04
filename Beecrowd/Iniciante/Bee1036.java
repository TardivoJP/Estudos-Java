import java.util.Scanner;

public class Bee1036 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double a,b,c;
        String tam1[] = s.nextLine().split(" ");
        a = Double.parseDouble(tam1[0]);
        b = Double.parseDouble(tam1[1]);
        c = Double.parseDouble(tam1[2]);
        
        double delta = Math.pow(b, 2) - (4*a*c);
        double x1 = (b*(-1)+Math.sqrt(delta))/(2*a);
        double x2 = (b*(-1)-Math.sqrt(delta))/(2*a);
        
        if(a == 0 || delta<0){
            System.out.printf("Impossivel calcular\n");
        }else{
            System.out.printf("R1 = %.5f\n",x1);
            System.out.printf("R2 = %.5f\n",x2);
        }
        s.close();
    }
}