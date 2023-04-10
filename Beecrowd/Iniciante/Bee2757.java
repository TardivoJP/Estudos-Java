import java.util.Scanner;

public class Bee2757 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println("A = "+a+", B = "+b+", C = "+c);
        System.out.printf("A = %10d, B = %10d, C = %10d\n",a,b,c);
        System.out.printf("A = %010d, B = %010d, C = %010d\n",a,b,c);
        System.out.printf("A = %-10d, B = %-10d, C = %-10d\n",a,b,c);
        s.close();
    }
}