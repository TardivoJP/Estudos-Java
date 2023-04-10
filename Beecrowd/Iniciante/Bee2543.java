import java.util.Scanner;

public class Bee2543 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int gameplays = s.nextInt();
            int identifier = s.nextInt();
            int total = 0;
            for(int i=0;i<gameplays;i++){
                int cod = s.nextInt();
                int lolORcs = s.nextInt();
                if(cod==identifier && lolORcs==0){
                    total++;
                }
            }
            System.out.println(total);

        }
        s.close();
    }
}