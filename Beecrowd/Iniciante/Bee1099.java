import java.util.Scanner;

public class Bee1099 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int arrSoma[] = new int[n];
        int x,y,maior,menor;
        for(int i=0;i<n;i++){
            String arr[] = s.nextLine().split(" ");
            x = Integer.parseInt(arr[0]);
            y = Integer.parseInt(arr[1]);
            maior = x;
            menor = y;
            if(x>y){
                maior=x;
                menor=y;
            }else{
                maior=y;
                menor=x;
            }
            for(int j = menor+1; j<maior; j++){
                if(!(j % 2 == 0)){
                    arrSoma[i]+=j;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arrSoma[i]);
        }
        s.close();
    }
}
