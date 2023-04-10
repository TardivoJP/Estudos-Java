import java.util.Scanner;

public class Bee2685{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int angle = s.nextInt();
            if(angle==360 || (angle>=0 && angle<90)){
                System.out.println("Bom Dia!!");
            }
            if(angle>=90 && angle<180){
                System.out.println("Boa Tarde!!");
            }
            if(angle>=180 && angle<270){
                System.out.println("Boa Noite!!");
            }
            if(angle>=270 && angle<360){
                System.out.println("De Madrugada!!");
            }
        }
        s.close();
    }
}