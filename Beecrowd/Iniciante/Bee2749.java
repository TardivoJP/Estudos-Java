public class Bee2749 {
    public static void main(String[] args) {
        for(int i=1;i<=39;i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=39;j++){

                switch(i){
                    case 1: switch(j){
                        case 1: System.out.print("|"); break;
                        case 2: System.out.print("x"); break;
                        case 4: System.out.print("="); break;
                        case 6: System.out.print("3"); break;
                        case 7: System.out.print("5"); break;
                        case 39: System.out.print("|"); break;
                        default: System.out.print(" "); break;
                    }
                    break;
                    case 3: switch(j){
                        case 1: System.out.print("|"); break;
                        case 17: System.out.print("x"); break;
                        case 19: System.out.print("="); break;
                        case 21: System.out.print("3"); break;
                        case 22: System.out.print("5"); break;
                        case 39: System.out.print("|"); break;
                        default: System.out.print(" "); break;
                    }
                    break;
                    case 5: switch(j){
                        case 1: System.out.print("|"); break;
                        case 33: System.out.print("x"); break;
                        case 35: System.out.print("="); break;
                        case 37: System.out.print("3"); break;
                        case 38: System.out.print("5"); break;
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
    }
}