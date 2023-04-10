import java.util.Scanner;

public class Bee2708{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String opt = "";
        int totalPeople = 0;
        int totalJeep = 0;
        while(true){
            opt = s.next();
            if(opt.equals("ABEND")){
                break;
            }
            int people = s.nextInt();
            switch(opt){
                case "SALIDA": totalPeople+=people; totalJeep++; break;
                case "VUELTA": totalPeople-=people; totalJeep--; break;
            }
        }
        System.out.println(totalPeople);
        System.out.println(totalJeep);
        s.close();
    }
}