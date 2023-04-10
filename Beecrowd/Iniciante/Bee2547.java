import java.util.Scanner;

public class Bee2547 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int amin = s.nextInt();
            int amax = s.nextInt();
            int pode = 0;
            for(int i=0;i<n;i++){
                int altura = s.nextInt();
                if(altura>=amin && altura<=amax){
                    pode++;
                }
            }
            System.out.println(pode);
        }
        s.close();
    }
}