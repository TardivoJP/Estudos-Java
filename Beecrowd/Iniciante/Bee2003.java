import java.util.Scanner;

public class Bee2003 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            String arr[] = s.nextLine().split(":");
            if(Integer.parseInt(arr[0])<7){
                System.out.println("Atraso maximo: 0");
            }else{
                int calculus = ((Integer.parseInt(arr[0])-7)*60)+Integer.parseInt(arr[1]);
                System.out.println("Atraso maximo: "+calculus);
            }
        }
        s.close();
    }
}