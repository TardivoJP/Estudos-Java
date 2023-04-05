import java.util.Scanner;

public class Bee1072 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x,in,out;
        x = in = out = 0;

        for(int i = 0; i<n; i++){
            x = s.nextInt();
            if(x>=10 && x<=20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println(in+" in");
        System.out.println(out+" out");
        s.close();
    }
}
