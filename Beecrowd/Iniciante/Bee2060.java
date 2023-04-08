import java.util.Scanner;

public class Bee2060 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m2=0,m3=0,m4=0,m5=0;
        for(int i=0;i<n;i++){
            int input = s.nextInt();
            if(input % 2 == 0){
                m2++;
            }
            if(input % 3 == 0){
                m3++;
            }
            if(input % 4 == 0){
                m4++;
            }
            if(input % 5 == 0){
                m5++;
            }
        }
        System.out.println(m2+" Multiplo(s) de 2");
        System.out.println(m3+" Multiplo(s) de 3");
        System.out.println(m4+" Multiplo(s) de 4");
        System.out.println(m5+" Multiplo(s) de 5");
        s.close();
    }
}