import java.util.Scanner;

public class Bee2486 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(true){
            int n = Integer.parseInt(s.nextLine());
            if(n==0){
                break;
            }
            int total=0;
            for(int i=0;i<n;i++){
                String arr[] = s.nextLine().split(" ");
                switch(arr[1]){
                    case "suco": total+=Integer.parseInt(arr[0])*120; break;
                    case "morango": total+=Integer.parseInt(arr[0])*85; break;
                    case "mamao": total+=Integer.parseInt(arr[0])*85; break;
                    case "goiaba": total+=Integer.parseInt(arr[0])*70; break;
                    case "manga": total+=Integer.parseInt(arr[0])*56; break;
                    case "laranja": total+=Integer.parseInt(arr[0])*50; break;
                    case "brocolis": total+=Integer.parseInt(arr[0])*34; break;
                }
            }
            if(total>130){
                System.out.println("Menos "+(total-130)+" mg");
            }else if(total<110){
                System.out.println("Mais "+(110-total)+" mg");
            }else if(total>=110 && total<=130){
                System.out.println(total+" mg");
            }
        }
        s.close();
    }
}