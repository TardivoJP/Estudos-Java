import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bee2653{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set<String> distinctStrings = new HashSet<>();
        while(s.hasNext()){
            String input = s.nextLine();
            distinctStrings.add(input);
        }
        System.out.println(distinctStrings.size());
        s.close();
    }
}