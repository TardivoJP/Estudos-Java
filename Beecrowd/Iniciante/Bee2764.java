import java.util.Scanner;

public class Bee2764 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data[] = s.nextLine().split("[/]");
        System.out.println(data[1]+"/"+data[0]+"/"+data[2]);
        System.out.println(data[2]+"/"+data[1]+"/"+data[0]);
        System.out.println(data[0]+"-"+data[1]+"-"+data[2]);
        s.close();
    }
}