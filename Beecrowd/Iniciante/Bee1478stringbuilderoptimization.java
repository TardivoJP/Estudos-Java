import java.util.Scanner;

public class Bee1478stringbuilderoptimization {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        while (x != 0) {
            int array[][] = new int[x][x];
            int countline;

            for (int i = 0; i < x; i++) {
                countline = 1;
                StringBuilder rowBuilder = new StringBuilder();
                for (int j = 0; j < x; j++) {
                    if (j >= i) {
                        array[i][j] = countline;
                        countline++;
                    }
                    if (j < i) {
                        array[i][j] = (i + 1) - j;
                    }

                    rowBuilder.append(String.format("%3d", array[i][j]));
                    if (j != x - 1) {
                        rowBuilder.append(" ");
                    }
                }

                System.out.println(rowBuilder.toString());
            }

            System.out.println();
            x = s.nextInt();
        }

        s.close();
    }
}
