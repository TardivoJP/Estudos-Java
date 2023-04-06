import java.util.Scanner;

public class Bee1142 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int contador,linhas;
        contador=linhas=0;
        int i=1;
        while(linhas!=n){
            if(contador!=3){
                System.out.print(i+" ");
                contador++;
                i++;    
            }else{
                System.out.println("PUM");
                contador=0;
                linhas++;
                i++;
            }
        }
        s.close();
    }
    
}