import java.util.Scanner;

public class Bee1047 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        int starthour = Integer.parseInt(arr[0]);
        int startmin = Integer.parseInt(arr[1]);
        int endhour = Integer.parseInt(arr[2]);
        int endmin = Integer.parseInt(arr[3]);
        int totalhour = 0;
        int totalmin = 0;

        if(endhour<starthour){
            totalhour = (24-starthour)+endhour;
        }else if(endhour>starthour){
            totalhour = endhour-starthour;
        }

        if(endmin<startmin){
            totalmin = (60-startmin)+endmin;
            totalhour -= 1;
            if(totalhour<0){
                totalhour=23;
            }
        }else if(endmin>startmin){
            totalmin = endmin-startmin;
        }

        if(starthour == endhour && startmin == endmin){
            System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");    
        }else{
            System.out.printf("O JOGO DUROU "+totalhour+" HORA(S) E "+totalmin+" MINUTO(S)\n");
        }
        
        s.close();
    }
}