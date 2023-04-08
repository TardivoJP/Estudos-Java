import java.util.Scanner;

public class Bee2523 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            String letras[] = s.nextLine().split("");
            int piscou = s.nextInt();
            StringBuilder result = new StringBuilder();
            for(int i=0;i<piscou;i++){
                int num = s.nextInt();
                for(int j=0;j<letras.length;j++){
                    if(j==num-1){
                        result.append(letras[j]);
                    }
                }
            }
            System.out.println(result.toString());
        }
        s.close();
    }
}