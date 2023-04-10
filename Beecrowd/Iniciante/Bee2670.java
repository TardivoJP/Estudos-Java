import java.util.Scanner;

public class Bee2670{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] peopleOnFloor = new int[3];
        int totalTime;

        for (int i = 0; i < 3; i++) {
            peopleOnFloor[i] = s.nextInt();
        }

        int[] travelTime = new int[3];
        for (int i = 0; i < 3; i++) {
            totalTime = 0;
            for (int j = 0; j < 3; j++) {
                totalTime += (Math.abs(i - j) * 1 * peopleOnFloor[j]);
            }
            travelTime[i] = totalTime;
        }

        int minTravelTime = travelTime[0];
        for (int i = 1; i < 3; i++) {
            if (travelTime[i] < minTravelTime) {
                minTravelTime = travelTime[i];
            }
        }

        System.out.println(minTravelTime*2);

        s.close();
    }
}