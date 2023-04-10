import java.util.Scanner;

public class Bee2724 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j=0;j<n;j++){
            int dangerousElements = sc.nextInt();
            String x[] = new String[dangerousElements];
            for(int i=0;i<dangerousElements;i++){
                x[i] = sc.next();
            }
            int numberOfTests = sc.nextInt();
            String testStrings[] = new String[numberOfTests];
            for(int i=0;i<numberOfTests;i++){
                testStrings[i] = sc.next();
            }
            for (String testString : testStrings) {
                boolean isValid = false;
                for (String s : x) {
                    int index = testString.indexOf(s);
                    while (index != -1) {
                        if (index + s.length() < testString.length() && (Character.isDigit(testString.charAt(index + s.length())) || Character.isLowerCase(testString.charAt(index + s.length())))) {
                            isValid = false;
                            break;
                        } else {
                            isValid = true;
                            index = testString.indexOf(s, index + 1);
                        }
                    }
                    if (isValid) {
                        break;
                    }
                }
                if (isValid) {
                    System.out.println("Abortar");
                } else {
                    System.out.println("Prossiga");
                }
            }
            if(j!=n-1){
                System.out.println();
            }
        }
        sc.close();
    }
}