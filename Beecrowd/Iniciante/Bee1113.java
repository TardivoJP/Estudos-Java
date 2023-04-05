import java.util.ArrayList;
import java.util.Scanner;

public class Bee1113 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        ArrayList<String> valores = new ArrayList<String>();
        int x=0;
        int y=1;

        while(x!=y){
            String arr[] = s.nextLine().split(" ");
            x = Integer.parseInt(arr[0]);
            y = Integer.parseInt(arr[1]);
            if(x!=y){
                if(x>y){
                    valores.add("Decrescente");
                }else{
                    valores.add("Crescente");
                }
            }
        }
        for(int i=0;i<valores.size();i++){
            System.out.println(valores.get(i));
        }
        s.close();
    }
}
