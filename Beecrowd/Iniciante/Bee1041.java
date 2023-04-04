import java.util.Scanner;

public class Bee1041 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        double x = Double.parseDouble(arr[0]);
        double y = Double.parseDouble(arr[1]);
        
        if(x==0 && y==0){
            System.out.printf("Origem\n");    
        } else if(x==0){
            System.out.printf("Eixo Y\n"); 
        } else if(y==0){
            System.out.printf("Eixo X\n"); 
        }
        if(x>0 && y>0){
            System.out.printf("Q1\n"); 
        }
        if(x>0 && y<0){
            System.out.printf("Q4\n"); 
        }
        if(x<0 && y>0){
            System.out.printf("Q2\n"); 
        }
        if(x<0 && y<0){
            System.out.printf("Q3\n"); 
        }
        s.close();
    }
}