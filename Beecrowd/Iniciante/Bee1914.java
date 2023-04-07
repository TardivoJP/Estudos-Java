import java.util.Scanner;

public class Bee1914 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for(int i=0;i<n;i++){
            String arra[] = s.nextLine().split(" ");
            String arrb[] = s.nextLine().split(" ");
            String par,impar;
            if(arra[1].equals("PAR")){
                par=arra[0];
                impar=arra[2];
            }else{
                impar=arra[0];
                par=arra[2];
            }
            int sum = Integer.parseInt(arrb[0])+Integer.parseInt(arrb[1]);
            if(sum % 2 == 0){
                System.out.println(par);
            }else{
                System.out.println(impar);
            }
        }
        s.close();
    }
}