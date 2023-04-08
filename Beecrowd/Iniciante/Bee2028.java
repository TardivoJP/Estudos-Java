import java.util.Scanner;

public class Bee2028 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int count = 1;
        while(s.hasNext()){
            int snowflakeFactorial = s.nextInt();
            int total = 1;
            for(int i=1;i<=snowflakeFactorial;i++){
                total+=i;
            }

            if(total==1){
                System.out.println("Caso "+count+": "+total+" numero");
            }else{
                System.out.println("Caso "+count+": "+total+" numeros");
            }
            System.out.print(0+" ");
            for(int i=1;i<=snowflakeFactorial;i++){
                for(int j=0;j<i;j++){
                    System.out.print(i+" ");
                }
                if(i == snowflakeFactorial){
                    System.out.println();
                }
            }
            count++;
            System.out.println();
        }
        System.out.println();
        s.close();
    }
}