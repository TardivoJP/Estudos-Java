import java.util.Scanner;

public class Bee2791 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        boolean found = false;
        while(s.hasNextInt()){
            int x = s.nextInt();
            if(!found){
                count++;
            }
            if(x==1){
                found=true;
            }
        }
        System.out.println(count);
        s.close();
    }
}