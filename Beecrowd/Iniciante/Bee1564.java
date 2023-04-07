import java.util.Scanner;

public class Bee1564 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int x = s.nextInt();
            if(x>0){
                System.out.println("vai ter duas!");
            }else{
                System.out.println("vai ter copa!");
            }
        }
        s.close();
    }
}