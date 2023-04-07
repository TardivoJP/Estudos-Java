import java.util.Scanner;

public class Bee1958 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double number = s.nextDouble();
        System.out.println(String.format((String.valueOf(number).startsWith("-") ? "" : "+") + "%.4E", number));
        s.close();
    }
}