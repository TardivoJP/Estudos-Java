import java.util.Scanner;

public class Bee1035 {
    
	public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double a,b,c,d;

        String tam1[] = s.nextLine().split(" ");

        a = Double.parseDouble(tam1[0]);
        b = Double.parseDouble(tam1[1]);
        c = Double.parseDouble(tam1[2]);
        d = Double.parseDouble(tam1[3]);
        
        if(b>c && d>a && (c+d)>(a+b) && c>=0 && d>=0 && a % 2 == 0){
            System.out.printf("Valores aceitos\n");
        }else{
            System.out.printf("Valores nao aceitos\n");
        }
        
        s.close();

    }

}