import java.util.Scanner;

public class Bee1115 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int z = 50;
        while(z<100){
            String arr[] = s.nextLine().split(" ");
            double x = Double.parseDouble(arr[0]);
            double y = Double.parseDouble(arr[1]);
            if(x>0 && y>0){
                System.out.printf("primeiro\n"); 
            }else if(x>0 && y<0){
                System.out.printf("quarto\n"); 
            }else if(x<0 && y>0){
                System.out.printf("segundo\n"); 
            }else if(x<0 && y<0){
                System.out.printf("terceiro\n"); 
            }else{
                break;
            }
        }
        s.close();
    }
}
