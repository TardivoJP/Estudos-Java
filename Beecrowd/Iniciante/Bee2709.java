import java.util.Scanner;

public class Bee2709{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int coins[] = new int[n];
            for(int i=0;i<n;i++){
                coins[i]=s.nextInt();
            }
            int leap = s.nextInt();
            int count = leap;
            double sum = 0;
            int j = n-1;
            for(int i=0;i<n;i++){
                if(count==leap){
                    sum+=coins[j];
                    leap=0;
                }
                leap++;
                j--;
            }
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(sum); i++){
                if(sum % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(sum>1 && isPrime){
                System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
            }else{
                System.out.println("Bad boy! I’ll hit you.");
            }
        }
        s.close();
    }
}