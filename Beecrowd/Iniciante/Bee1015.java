import java.util.Scanner;

public class Bee1015 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double a,b,c,d;
        String tam1[] = s.nextLine().split(" ");
        a = Double.parseDouble(tam1[0]);
        b = Double.parseDouble(tam1[1]);
        String tam2[] = s.nextLine().split(" ");
        c = Double.parseDouble(tam2[0]);
        d = Double.parseDouble(tam2[1]);
        System.out.printf("%.4f\n",Math.sqrt(Math.pow((c-a), 2)+Math.pow((d-b), 2)));
        s.close();
    }
}