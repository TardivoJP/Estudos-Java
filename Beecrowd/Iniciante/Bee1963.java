import java.util.Scanner;

public class Bee1963 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        System.out.printf("%.2f%%\n",((Double.parseDouble(arr[1])-Double.parseDouble(arr[0]))*100)/Double.parseDouble(arr[0]));
        s.close();
    }
}