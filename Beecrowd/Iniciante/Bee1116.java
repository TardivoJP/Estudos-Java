import java.util.Scanner;

public class Bee1116 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for(int i=0;i<n;i++){
            String arr[] = s.nextLine().split(" ");
            double x = Double.parseDouble(arr[0]);
            double y = Double.parseDouble(arr[1]);
            if(Double.isNaN(x%y)){
                System.out.println("divisao impossivel");
            }else{
                System.out.println(x/y);
            }
        }
        s.close();
    }
}
