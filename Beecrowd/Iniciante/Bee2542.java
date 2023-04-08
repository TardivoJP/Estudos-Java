import java.util.Scanner;

public class Bee2542 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int atributos = s.nextInt();
            int tamMarcos = s.nextInt();
            int tamLeonardo = s.nextInt();
            int baralhoMarcos[][]= new int[tamMarcos][atributos];
            int baralhoLeonardo[][]= new int[tamLeonardo][atributos];
            for(int i=0;i<tamMarcos;i++){
                for(int j=0;j<atributos;j++){
                    baralhoMarcos[i][j] = s.nextInt();
                }
            }
            for(int i=0;i<tamLeonardo;i++){
                for(int j=0;j<atributos;j++){
                    baralhoLeonardo[i][j] = s.nextInt();
                }
            }
            int cartaMarcos = s.nextInt();
            int cartaLeonardo = s.nextInt();
            int atributoSorteado = s.nextInt();
            if(baralhoMarcos[cartaMarcos-1][atributoSorteado-1]>baralhoLeonardo[cartaLeonardo-1][atributoSorteado-1]){
                System.out.println("Marcos");
            }else if(baralhoMarcos[cartaMarcos-1][atributoSorteado-1]<baralhoLeonardo[cartaLeonardo-1][atributoSorteado-1]){
                System.out.println("Leonardo");
            }else{
                System.out.println("Empate");
            }
        }
        s.close();
    }
}