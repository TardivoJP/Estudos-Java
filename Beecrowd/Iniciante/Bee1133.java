import java.util.Scanner;

public class Bee1133 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int maior,menor;
        maior=menor=0;
        if(x>y){
            maior=x;
            menor=y;
        }else{
            maior=y;
            menor=x;
        }
        for(int i = menor+1;i<maior;i++){
            if(i % 5 == 2){
                System.out.println(i);
            }else if(i % 5 == 3){
                System.out.println(i);
            }
            
        }
        s.close();
    }
}
