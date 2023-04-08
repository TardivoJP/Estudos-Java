import java.util.Scanner;

public class Bee2031 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for(int i=1;i<=n;i++){
            String jugador1 = s.nextLine();
            String jugador2 = s.nextLine();

            switch(jugador1){
                case "pedra": switch(jugador2){
                    case "pedra": System.out.println("Sem ganhador"); break;
                    case "papel": System.out.println("Jogador 1 venceu"); break;
                    case "ataque": System.out.println("Jogador 2 venceu"); break;
                }
                    break;
                case "papel": switch(jugador2){
                    case "pedra": System.out.println("Jogador 2 venceu"); break;
                    case "papel": System.out.println("Ambos venceram"); break;
                    case "ataque": System.out.println("Jogador 2 venceu"); break;
                }
                    break;
                case "ataque": switch(jugador2){
                    case "pedra": System.out.println("Jogador 1 venceu"); break;
                    case "papel": System.out.println("Jogador 1 venceu"); break;
                    case "ataque": System.out.println("Aniquilacao mutua"); break;
                }
                    break;
            }
        }
        s.close();
    }
}