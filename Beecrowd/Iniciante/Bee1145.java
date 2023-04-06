import java.util.Scanner;

public class Bee1145 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        int x=Integer.parseInt(arr[0]);
        int y=Integer.parseInt(arr[1]);
        int a=1;
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                if(j==(x-1)){
                    System.out.println(a);
                }else{
                    System.out.print(a+" ");
                }
                if(a==y){
                    break;
                }
                a++;
            }
            if(a==y){
                break;
            }
        }
        s.close();
    }
}