import java.util.Scanner;

public class Bee2760 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        String c = s.nextLine();
        System.out.println(a+b+c);
        System.out.println(b+c+a);
        System.out.println(c+a+b);
        String ar[] = a.split("");
        String br[] = b.split("");
        String cr[] = c.split("");
        int n = 0;
        if(ar.length>10){
            n=10;
        }else{
            n=ar.length;
        }
        for(int i=0;i<n;i++){
            System.out.print(ar[i]);
        }
        if(br.length>10){
            n=10;
        }else{
            n=br.length;
        }
        for(int i=0;i<n;i++){
            System.out.print(br[i]);
        }
        if(cr.length>10){
            n=10;
        }else{
            n=cr.length;
        }
        for(int i=0;i<n;i++){
            System.out.print(cr[i]);
        }
        System.out.println();
        s.close();
    }
}