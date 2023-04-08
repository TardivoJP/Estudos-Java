import java.math.BigInteger;
import java.util.Scanner;

public class Bee2334 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(true){
            BigInteger n = new BigInteger(s.nextLine());
            BigInteger x = new BigInteger("1");
            if(n.toString().equals("-1")){
                break;
            }
            if(!(n.toString().equals("0"))){
                BigInteger diff = n.subtract(x);
                System.out.println(diff);
            }else{
                System.out.println("0");
            }
        }
        
        s.close();
    }
}