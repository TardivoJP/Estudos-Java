import java.util.Scanner;

public class Bee1962 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            int x = s.nextInt();
            if(x<2015){
                System.out.println((2015-x)+" D.C.");
            }else{
                System.out.println((x-2015+1)+" A.C.");
            }
        }
        s.close();
    }
}