import java.util.Scanner;

public class Bee2748 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int i=1;i<=39;i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=39;j++){

                switch(i){
                    case 1: switch(j){
                        case 1: System.out.print("|"); break;
                        case 2: System.out.print("R"); break;
                        case 4: System.out.print("o"); break;
                        case 6: System.out.print("b"); break;
                        case 7: System.out.print("e"); break;
                        case 14: System.out.print("r"); break;
                        case 15: System.out.print("t"); break;
                        case 16: System.out.print("o"); break;
                        case 39: System.out.print("|"); break;
                        default: System.out.print(" "); break;
                    }
                    break;
                    case 3: switch(j){
                        case 1: System.out.print("|"); break;
                        case 10: System.out.print("5"); break;
                        case 11: System.out.print("7"); break;
                        case 12: System.out.print("8"); break;
                        case 13: System.out.print("6"); break;
                        case 39: System.out.print("|"); break;
                        default: System.out.print(" "); break;
                    }
                    break;
                    case 5: switch(j){
                        case 1: System.out.print("|"); break;
                        case 10: System.out.print("U"); break;
                        case 11: System.out.print("N"); break;
                        case 12: System.out.print("I"); break;
                        case 13: System.out.print("F"); break;
                        case 14: System.out.print("E"); break;
                        case 15: System.out.print("I"); break;
                        case 39: System.out.print("|"); break;
                        default: System.out.print(" "); break;
                    }
                    break;
                    default: switch(j){
                        case 1: System.out.print("|"); break;
                        case 39: System.out.print("|"); break;
                        default: System.out.print(" "); break;
                    }
                    break;
                }
            }
            System.out.println();
        }
        for(int i=1;i<=39;i++){
            System.out.print("-");
        }
        System.out.println();
        s.close();
    }
}