import java.util.Scanner;

public class Bee1789 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int t = Integer.parseInt(s.nextLine());
            String arr[] = s.nextLine().split(" ");
            int maior=Integer.parseInt(arr[0]);
            for(int j=0;j<arr.length;j++){
                if(Integer.parseInt(arr[j])>maior){
                    maior=Integer.parseInt(arr[j]);
                }
            }
            if(maior<10){
                System.out.println(1);
            }else if(maior<20){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }
        s.close();
    }
}