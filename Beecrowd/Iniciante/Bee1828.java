import java.util.Scanner;

public class Bee1828 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for(int i=1;i<=n;i++){
            String arr[] = s.nextLine().split(" ");
            switch(arr[0]){
                case "pedra": switch(arr[1]){
                    case "pedra": System.out.println("Caso #"+i+": De novo!");break;
                    case "papel":System.out.println("Caso #"+i+": Raj trapaceou!");break;
                    case "tesoura":System.out.println("Caso #"+i+": Bazinga!");break;
                    case "lagarto":System.out.println("Caso #"+i+": Bazinga!");break;
                    case "Spock":System.out.println("Caso #"+i+": Raj trapaceou!");break;
                }    
                    break;
                case "papel": switch(arr[1]){
                    case "pedra": System.out.println("Caso #"+i+": Bazinga!");break;
                    case "papel":System.out.println("Caso #"+i+": De novo!");break;
                    case "tesoura":System.out.println("Caso #"+i+": Raj trapaceou!");break;
                    case "lagarto":System.out.println("Caso #"+i+": Raj trapaceou!");break;
                    case "Spock":System.out.println("Caso #"+i+": Bazinga!");break;
                }   
                    break;
                case "tesoura": switch(arr[1]){
                    case "pedra": System.out.println("Caso #"+i+": Raj trapaceou!");break;
                    case "papel":System.out.println("Caso #"+i+": Bazinga!");break;
                    case "tesoura":System.out.println("Caso #"+i+": De novo!");break;
                    case "lagarto":System.out.println("Caso #"+i+": Bazinga!");break;
                    case "Spock":System.out.println("Caso #"+i+": Raj trapaceou!");break;
                }   
                    break;
                case "lagarto": switch(arr[1]){
                    case "pedra": System.out.println("Caso #"+i+": Raj trapaceou!");break;
                    case "papel":System.out.println("Caso #"+i+": Bazinga!");break;
                    case "tesoura":System.out.println("Caso #"+i+": Raj trapaceou!");break;
                    case "lagarto":System.out.println("Caso #"+i+": De novo!");break;
                    case "Spock":System.out.println("Caso #"+i+": Bazinga!");break;
                }   
                    break;
                case "Spock": switch(arr[1]){
                    case "pedra": System.out.println("Caso #"+i+": Bazinga!");break;
                    case "papel":System.out.println("Caso #"+i+": Raj trapaceou!");break;
                    case "tesoura":System.out.println("Caso #"+i+": Bazinga!");break;
                    case "lagarto":System.out.println("Caso #"+i+": Raj trapaceou!");break;
                    case "Spock":System.out.println("Caso #"+i+": De novo!");break;
                }   
                    break;
            }
        }
        s.close();
    }
}