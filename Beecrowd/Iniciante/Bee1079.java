import java.util.Scanner;

public class Bee1079 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        double results[] = new double[n];
        double a,b,c;
        a=b=c=0;

        for(int i=0; i<n; i++){
            String arr[] = s.nextLine().split(" ");
            a = Double.parseDouble(arr[0]);
            b = Double.parseDouble(arr[1]);
            c = Double.parseDouble(arr[2]);
            results[i]=((a*2)+(b*3)+(c*5))/10;
        }
        for(int i=0; i<n; i++){
            System.out.printf("%.1f\n",results[i]);
        }
        s.close();
    }
}
