import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bee2782 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s");
        int size = Integer.parseInt(input[0]);
        String[] sequenceStr = br.readLine().split("\\s");
        int[] sequence = new int[size];
        for (int i = 0; i < size; i++) {
            sequence[i] = Integer.parseInt(sequenceStr[i]);
        }
        int steps = 0;
        int difference = Integer.MAX_VALUE;

        for (int i = 1; i < size; i++) {
            if (sequence[i] - sequence[i - 1] != difference) {
                difference = sequence[i] - sequence[i - 1];
                steps++;
            }
        }

        if (size == 1) {
            steps = 1;
        }

        System.out.println(steps);
    }
}
