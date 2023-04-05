import java.util.Scanner;

public class Bee1074 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x[] = new int[n];

        for(int i=0; i<n; i++){
            x[i] = s.nextInt();
        }
        
        for(int i = 0; i<n; i++){
            if(x[i]==0){
                System.out.println("NULL");
            }else{
                if(x[i]%2==0){
                    System.out.print("EVEN ");
                }else{
                    System.out.print("ODD ");
                }
    
                if(x[i]>0){
                    System.out.println("POSITIVE");
                }else{
                    System.out.println("NEGATIVE");
                }
            }
        }
        s.close();
    }
}
