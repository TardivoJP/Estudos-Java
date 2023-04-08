import java.util.Scanner;

public class Bee2502 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            String values[] = s.nextLine().split(" ");
            String arrayA[] = s.nextLine().split("");
            String arrayB[] = s.nextLine().split("");
            for(int i=0;i<Integer.parseInt(values[1]);i++){
                String line = s.nextLine();
                String result = switchLetters(line, arrayA, arrayB);
                System.out.println(result);
            }
            System.out.println();
        }
        s.close();
    }

    public static String switchLetters(String str, String[] arrayA, String[] arrayB) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            for (int j = 0; j < arrayA.length; j++) {
                if (Character.toString(c).equalsIgnoreCase(arrayA[j])) {
                    chars[i] = Character.isUpperCase(c) ? arrayB[j].toUpperCase().charAt(0) : arrayB[j].toLowerCase().charAt(0);
                    break;
                } else if (Character.toString(c).equalsIgnoreCase(arrayB[j])) {
                    chars[i] = Character.isUpperCase(c) ? arrayA[j].toUpperCase().charAt(0) : arrayA[j].toLowerCase().charAt(0);
                    break;
                }
            }
        }
        return new String(chars);
    }
}