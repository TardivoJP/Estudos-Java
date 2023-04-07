import java.util.Scanner;

public class Bee1158 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for(int i=0;i<n;i++){
            String arr[] = s.nextLine().split(" ");
            int x=Integer.parseInt(arr[0]);
            int y=Integer.parseInt(arr[1]);
            int count=0;
            int soma=0;

            while(count<y){
                if(!(x % 2 == 0)){
                    soma+=x;
                    count++;
                }
                x++;
            }
            System.out.println(soma);
        }
        s.close();
    }
}