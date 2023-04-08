import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Bee2493 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> values = new LinkedList<Integer>();
        while(s.hasNext()){
            String[] arrBeecrowdInputZoado = s.nextLine().split(" ");
            int n = Integer.parseInt(arrBeecrowdInputZoado[0]);
            StringBuilder todos = new StringBuilder();
            StringBuilder result = new StringBuilder();
            for(int i=0;i<n;i++){
                String[] arr = s.nextLine().split("[\\s=]+");
                values.add(Integer.parseInt(arr[0]));
                values.add(Integer.parseInt(arr[1]));
                values.add(Integer.parseInt(arr[2]));
            }

            for(int i=0;i<n;i++){
                String[] arr = s.nextLine().split(" ");
                int index = Integer.parseInt(arr[1]);
                todos.append(arr[0]+" ");
                switch(arr[2]){
                    case "+": if(!(values.get((index*3)-3)+values.get((index*3)-2)==values.get((index*3)-1))){
                        result.append(arr[0]+" ");
                    } 
                    break;
                    case "-": if(!(values.get((index*3)-3)-values.get((index*3)-2)==values.get((index*3)-1))){
                        result.append(arr[0]+" ");
                    } 
                    break;
                    case "*": if(!(values.get((index*3)-3)*values.get((index*3)-2)==values.get((index*3)-1))){
                        result.append(arr[0]+" ");
                    } 
                    break;
                    case "I": if(!(values.get((index*3)-3)+values.get((index*3)-2)!=values.get((index*3)-1) && values.get((index*3)-3)-values.get((index*3)-2)!=values.get((index*3)-1) && values.get((index*3)-3)*values.get((index*3)-2)!=values.get((index*3)-1))){
                        result.append(arr[0]+" ");
                    } 
                    break;
                }
            }

            if(result.length()==0){
                System.out.println("You Shall All Pass!");
            }else{
                todos.deleteCharAt(todos.length()-1);
                String[] names = todos.toString().split(" ");
                Arrays.sort(names);
                todos = new StringBuilder();
                for (String name : names) {
                    todos.append(name).append(" ");
                }

                result.deleteCharAt(result.length()-1);
                names = result.toString().split(" ");
                Arrays.sort(names);
                result = new StringBuilder();
                for (String name : names) {
                    result.append(name).append(" ");
                }

                if(result.toString().equals(todos.toString())){
                    System.out.println("None Shall Pass!");
                }else{
                    System.out.println(result.toString());
                }
            }
            values.clear();
        }
        s.close();
    }
}