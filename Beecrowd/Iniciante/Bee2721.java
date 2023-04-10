import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bee2721 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] snowballs = new int[9];
        for (int i = 0; i < 9; i++) {
            snowballs[i] = s.nextInt();
        }
        int totalSnowballs = Arrays.stream(snowballs).sum();
        int lastSnowballIndex = (totalSnowballs - 1) % 9;
        List<String> reindeerNames = Arrays.asList("Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen", "Rudolph");
        String newLeader = reindeerNames.get(lastSnowballIndex);
        System.out.println(newLeader);
        s.close();
    }
}