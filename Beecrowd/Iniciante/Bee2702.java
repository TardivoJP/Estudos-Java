import java.util.Scanner;

public class Bee2702{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int aa = s.nextInt();
        int bb = s.nextInt();
        int cc = s.nextInt();
        int aaa = a-aa;
        int bbb = b-bb;
        int ccc = c-cc;
        int abc= 0;
        if(aaa<0){
            abc+=aaa;
        }
        if(bbb<0){
            abc+=bbb;
        }
        if(ccc<0){
            abc+=ccc;
        }
        System.out.println(abc*(-1));
        s.close();
    }
}