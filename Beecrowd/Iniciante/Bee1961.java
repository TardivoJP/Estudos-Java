import java.util.Scanner;

public class Bee1961 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        boolean victory = true;
        String arra[] = s.nextLine().split(" ");
        int pulo = Integer.parseInt(arra[0]);
        String arrb[] = s.nextLine().split(" ");
        for(int i=0;i<arrb.length;i++){
            if(i>0){
                int gap = Integer.parseInt(arrb[i])-Integer.parseInt(arrb[i-1]);
                if(gap<0){
                    gap*=-1;
                }
                if(gap>pulo){
                    victory=false;
                    break;
                }
            }
        }
        if(victory){
            System.out.println("YOU WIN");
        }else{
            System.out.println("GAME OVER");
        }
        s.close();
    }
}