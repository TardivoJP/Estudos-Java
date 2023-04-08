import java.util.Scanner;

public class Bee2540 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int pop = s.nextInt();
            int votos = 0;
            for(int i=0;i<pop;i++){
                int voto = s.nextInt();
                if(voto==1){
                    votos++;
                }
            }
            double conta = ((double) ((double) pop)*(((double)2.0)/((double)3.0)));
            if(votos>=conta){
                System.out.println("impeachment");
            }else{
                System.out.println("acusacao arquivada");
            }
        }
        s.close();
    }
}