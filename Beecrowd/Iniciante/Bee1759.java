import java.util.Scanner;

public class Bee1759 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++){
            if(i!=t-1){
                System.out.print("Ho ");
            }else{
                System.out.println("Ho!");
            }
        }
        s.close();
    }
}