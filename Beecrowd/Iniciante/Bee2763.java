import java.util.Scanner;

public class Bee2763 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String cpf[] = s.nextLine().split("[.-]");
        for(int i=0;i<cpf.length;i++){
            System.out.println(cpf[i]);
        }
        s.close();
    }
}