import java.util.Scanner;

public class Bee2533 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int r = s.nextInt();
            double totalCima=0;
            double totalBaixo=0;
            for(int i=0;i<r;i++){
                int n = s.nextInt();
                int c = s.nextInt();
                totalCima+=(n*c);
                totalBaixo+=(c*100);
            }
            double totalGeral = totalCima/totalBaixo;
            System.out.printf("%.4f\n",totalGeral);
        }
        s.close();
    }
}