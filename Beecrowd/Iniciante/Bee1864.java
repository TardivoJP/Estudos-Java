import java.util.Scanner;

public class Bee1864 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String message = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        String arr[] = message.split("");

        for(int i=0;i<n;i++){
            if(i == n-1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]);
            }
        }
        s.close();
    }
}