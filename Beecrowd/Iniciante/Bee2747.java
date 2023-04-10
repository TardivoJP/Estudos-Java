import java.util.Scanner;

public class Bee2747 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int i=1;i<=39;i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=39;j++){
                if(j==1 || j==39){
                    System.out.print("|");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=39;i++){
            System.out.print("-");
        }
        System.out.println();
        s.close();
    }
}