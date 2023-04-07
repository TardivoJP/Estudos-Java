import java.util.Scanner;

public class Bee1160 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for(int i=0;i<n;i++){
            String arr[] = s.nextLine().split(" ");
            double pa= Double.parseDouble(arr[0]);
            double pb= Double.parseDouble(arr[1]);
            double ga = Double.parseDouble(arr[2]);
            double gb = Double.parseDouble(arr[3]);
            int count=0;

            while(pa<=pb){
                pa=Math.floor(pa+(pa*(ga/100)));
                pb=Math.floor(pb+(pb*(gb/100)));
                count++;
                if(count>100){
                    break;
                }
            }
            if(count<=100){
                System.out.println(count+" anos.");
            }else{
                System.out.println("Mais de 1 seculo.");
            }
            
        }
        s.close();
    }
}