import java.util.Scanner;

public class Bee1046 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        int start = Integer.parseInt(arr[0]);
        int end = Integer.parseInt(arr[1]);
        int total = 0;

        if(end<start){
            total = (24-start)+end;
        }else if(end>start){
            total = end-start;
        }else{
            total = 24;
        }

        System.out.println("O JOGO DUROU "+total+" HORA(S)");
        
        s.close();
    }
}