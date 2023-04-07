import java.util.Scanner;

public class Bee1865 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for(int i=0;i<n;i++){
            String arr[] = s.nextLine().split(" ");
            if(arr[0].equals("Thor")){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }
        s.close();
    }
}