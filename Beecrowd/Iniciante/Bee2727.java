import java.util.Scanner;

public class Bee2727 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = Integer.parseInt(s.nextLine());
            for(int i=0;i<n;i++){
                String dotPattern = s.nextLine();
                String[] segments = dotPattern.split(" ");
                int dots = segments[0].length();
                int sets = segments.length;
                int letterCode = (dots + (sets*3)) + 93;
                char letter = (char) letterCode;
                System.out.println(letter);
            }
        }
        s.close();
    }
}