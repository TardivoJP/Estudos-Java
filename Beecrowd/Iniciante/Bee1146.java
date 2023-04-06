import java.util.Scanner;

public class Bee1146 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x=1;
        while(x!=0){
            x=s.nextInt();
            for(int i=1;i<=x;i++){
                if(i==x){
                    System.out.println(i);    
                }else{
                    System.out.print(i+" ");    
                }
            }
        }
        s.close();
    }
}