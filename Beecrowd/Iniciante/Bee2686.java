import java.util.Scanner;

public class Bee2686{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            double angle = s.nextDouble();
            int totalSeconds = (int) Math.round(angle / 360.0 * 24 * 3600);
            int hours = (totalSeconds / 3600) % 24;
            hours+=6;
            if(hours>=24){
                hours-=24;
            }
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;
            String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);

            if(angle==360 || (angle>=0 && angle<90)){
                System.out.printf("Bom Dia!!\n%s\n",time);
            }
            if(angle>=90 && angle<180){
                System.out.printf("Boa Tarde!!\n%s\n",time);
            }
            if(angle>=180 && angle<270){
                System.out.printf("Boa Noite!!\n%s\n",time);
            }
            if(angle>=270 && angle<360){
                System.out.printf("De Madrugada!!\n%s\n",time);
            }
        }
        s.close();
    }
}