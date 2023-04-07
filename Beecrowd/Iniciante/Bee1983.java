import java.util.Scanner;

public class Bee1983 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String insc = "";
        double maior = 0;
        for(int i=0;i<n;i++){
            String arr[] = s.nextLine().split(" ");
            if(Double.parseDouble(arr[1])>maior){
                maior=Double.parseDouble(arr[1]);
                insc=arr[0];
            }
        }
        if(maior>=8){
            System.out.println(insc);
        }else{
            System.out.println("Minimum note not reached");
        }

        s.close();
    }
}