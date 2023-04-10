import java.util.Scanner;

public class Bee2762 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String number = s.next();
        int dotIndex = number.indexOf('.');
        String integerPart = number.substring(0, dotIndex);
        String fractionalPart = number.substring(dotIndex + 1);
        int i = 0;
        while (i < integerPart.length() && integerPart.charAt(i) == '0') {
            i++;
        }
        integerPart = integerPart.substring(i);
        i = 0;
        while (i < fractionalPart.length() && fractionalPart.charAt(i) == '0') {
            i++;
        }
        fractionalPart = fractionalPart.substring(i);
        if (integerPart.isEmpty() && fractionalPart.isEmpty()) {
            System.out.println("0.0");
        } else if (integerPart.isEmpty()) {
            System.out.println(fractionalPart+".0");
        } else if (fractionalPart.isEmpty()) {
            System.out.println("0."+integerPart);
        } else {
            String invertedNumber = fractionalPart + "." + integerPart;
            System.out.println(invertedNumber);
        }
        s.close();
    }
}