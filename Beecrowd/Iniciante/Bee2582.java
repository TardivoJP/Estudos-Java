import java.util.Scanner;

public class Bee2582 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int soma = a+b;
            switch(soma){
                case 0: System.out.println("PROXYCITY"); break;
                case 1: System.out.println("P.Y.N.G."); break;
                case 2: System.out.println("DNSUEY!"); break;
                case 3: System.out.println("SERVERS"); break;
                case 4: System.out.println("HOST!"); break;
                case 5: System.out.println("CRIPTONIZE"); break;
                case 6: System.out.println("OFFLINE DAY"); break;
                case 7: System.out.println("SALT"); break;
                case 8: System.out.println("ANSWER!"); break;
                case 9: System.out.println("RAR?"); break;
                case 10: System.out.println("WIFI ANTENNAS"); break;
            }
        }
        s.close();
    }
}