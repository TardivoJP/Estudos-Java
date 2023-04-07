import java.util.Scanner;

public class Bee1985 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        double total =0;
        for(int i=0;i<n;i++){
            String arr[] = s.nextLine().split(" ");
            switch(arr[0]){
                case "1001": total+=1.5*Double.parseDouble(arr[1]); break;
                case "1002": total+=2.5*Double.parseDouble(arr[1]); break;
                case "1003": total+=3.5*Double.parseDouble(arr[1]); break;
                case "1004": total+=4.5*Double.parseDouble(arr[1]); break;
                case "1005": total+=5.5*Double.parseDouble(arr[1]); break;
            }
        }
        System.out.printf("%.2f\n",total);
        s.close();
    }
}