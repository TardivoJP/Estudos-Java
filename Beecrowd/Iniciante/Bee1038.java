import java.util.Scanner;

public class Bee1038 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");

        switch(arr[0]){
            case "1": System.out.printf("Total: R$ %.2f\n",Double.parseDouble(arr[1])*4); break;
            case "2": System.out.printf("Total: R$ %.2f\n",Double.parseDouble(arr[1])*4.5); break;
            case "3": System.out.printf("Total: R$ %.2f\n",Double.parseDouble(arr[1])*5); break;
            case "4": System.out.printf("Total: R$ %.2f\n",Double.parseDouble(arr[1])*2); break;
            case "5": System.out.printf("Total: R$ %.2f\n",Double.parseDouble(arr[1])*1.5); break;
        }

        s.close();
    }
}