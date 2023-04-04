import java.util.HashMap;
import java.util.Map;

public class FizzBuzzElegant {
    public static void main(String args[]){
        int i;
        String output;
        HashMap<Integer, Object> divisionTest = new HashMap<Integer, Object>();
        divisionTest.put(3,"Fizz");
        divisionTest.put(5,"Buzz");

        for(i = 1; i<=100; i++){
            output = "";
            for (Map.Entry<Integer, Object> set : divisionTest.entrySet()) {
                if(i % set.getKey() == 0){
                    output+=set.getValue();
                }
            }
            if(output==""){
                output=Integer.toString(i);
            }
            System.out.println(output);
        }
    }
}