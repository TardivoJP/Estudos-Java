import java.util.Scanner;

public class Bee1008 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        int hrs = s.nextInt();
        double wage = s.nextDouble();
        double salary = hrs * wage;
        System.out.printf("NUMBER = %d\n",no);
        System.out.printf("SALARY = U$ %.2f\n",salary);
        s.close();
    }
}