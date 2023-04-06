import java.util.Scanner;

public class Bee1153 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int fat=x;
        for(int i=1;i<x;i++){
            fat=fat*i;
        }
        System.out.println(fat);
        s.close();
    }
}