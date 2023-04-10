public class Bee2750 {
    public static void main(String[] args) {
        int var = 0;
        for(int i=1;i<=20;i++){
            for(int j=1;j<=39;j++){
                switch(i){
                    case 1: switch(j){
                        default: System.out.print("-"); break;
                    }
                    break;
                    case 2: switch(j){
                        case 1: System.out.print("|"); break;
                        case 4: System.out.print("d"); break;
                        case 5: System.out.print("e"); break;
                        case 6: System.out.print("c"); break;
                        case 7: System.out.print("i"); break;
                        case 8: System.out.print("m"); break;
                        case 9: System.out.print("a"); break;
                        case 10: System.out.print("l"); break;
                        case 13: System.out.print("|"); break;
                        case 16: System.out.print("o"); break;
                        case 17: System.out.print("c"); break;
                        case 18: System.out.print("t"); break;
                        case 19: System.out.print("a"); break;
                        case 20: System.out.print("l"); break;
                        case 23: System.out.print("|"); break;
                        case 26: System.out.print("H"); break;
                        case 27: System.out.print("e"); break;
                        case 28: System.out.print("x"); break;
                        case 29: System.out.print("a"); break;
                        case 30: System.out.print("d"); break;
                        case 31: System.out.print("e"); break;
                        case 32: System.out.print("c"); break;
                        case 33: System.out.print("i"); break;
                        case 34: System.out.print("m"); break;
                        case 35: System.out.print("a"); break;
                        case 36: System.out.print("l"); break;
                        case 39: System.out.print("|"); break;
                        default: System.out.print(" "); break;
                    }
                    break;
                    case 3: switch(j){
                        default: System.out.print("-"); break;
                    }
                    break;
                    case 20: switch(j){
                        default: System.out.print("-"); break;
                    }
                    break;
                }
                if(i>3 && i<=11){
                    switch(j){
                        case 1: System.out.print("|"); break;
                        case 8: System.out.print(var); break;
                        case 13: System.out.print("|"); break;
                        case 18: System.out.print(Integer.toOctalString(var)); break;
                        case 23: System.out.print("|"); break;
                        case 31: System.out.print(Integer.toHexString(var).toUpperCase()); break;
                        case 39: System.out.print("|"); break;
                        default: System.out.print(" "); break;
                    }
                }
                if(i>11 && i<=13){
                    switch(j){
                        case 1: System.out.print("|"); break;
                        case 8: System.out.print(var); break;
                        case 13: System.out.print("|"); break;
                        case 17: System.out.print(Integer.toOctalString(var)); break;
                        case 19: System.out.print(""); break;
                        case 23: System.out.print("|"); break;
                        case 31: System.out.print(Integer.toHexString(var).toUpperCase()); break;
                        case 39: System.out.print("|"); break;
                        default: System.out.print(" "); break;
                    }
                }
                if(i>13 && i<20){
                    switch(j){
                        case 1: System.out.print("|"); break;
                        case 7: System.out.print(var); break;
                        case 9: System.out.print(""); break;
                        case 13: System.out.print("|"); break;
                        case 17: System.out.print(Integer.toOctalString(var)); break;
                        case 19: System.out.print(""); break;
                        case 23: System.out.print("|"); break;
                        case 31: System.out.print(Integer.toHexString(var).toUpperCase()); break;
                        case 39: System.out.print("|"); break;
                        default: System.out.print(" "); break;
                    }
                }
                
            }
            System.out.println();
            if(i>3){
                var++;
            }
        }
    }
}