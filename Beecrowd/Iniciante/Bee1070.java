import java.util.Scanner;

public class Bee1070 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int prints = 0;
        int i = x;
        while(prints<6){
            if(!(i % 2 == 0)){
                System.out.println(i);
                prints++;
            }
            i++;
        }
        s.close();
    }
}
