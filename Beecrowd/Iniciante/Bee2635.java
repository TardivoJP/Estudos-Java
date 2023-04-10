import java.util.Scanner;

public class Bee2635{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] testWords = new String[n];
        for (int i = 0; i < n; i++) {
            testWords[i] = s.next();
        }
        int q = s.nextInt();
        for (int i = 0; i < q; i++) {
            String query = s.next();
            int matches = 0;
            int longestMatch = 0;
            for (String testWord : testWords) {
                if (testWord.startsWith(query)) {
                    matches++;
                    longestMatch = Math.max(longestMatch, testWord.length());
                }
            }
            if(matches == 0){
                System.out.println(-1);
            }else{
                System.out.println(matches + " " + longestMatch);
            }
            
        }
        s.close();
    }
}