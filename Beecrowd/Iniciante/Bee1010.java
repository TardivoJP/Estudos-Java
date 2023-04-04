import java.util.Scanner;

public class Bee1010 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int cod,num;
        double total = 0;
        String tam1[] = s.nextLine().split(" ");
        cod = Integer.parseInt(tam1[0]);
        num = Integer.parseInt(tam1[1]);
        total += Double.parseDouble(tam1[2])*num;
        String tam2[] = s.nextLine().split(" ");
        cod = Integer.parseInt(tam2[0]);
        num = Integer.parseInt(tam2[1]);
        total += Double.parseDouble(tam2[2])*num;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
        s.close();
    }
}