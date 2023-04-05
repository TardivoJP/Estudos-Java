import java.util.Scanner;

public class Bee1131 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int z = 50;
        int cont,vitInt,vitGre,empate,x,y,selecao;
        cont=vitInt=vitGre=empate=x=y=selecao=0;
        while(z<100){
            String arr[] = s.nextLine().split(" ");
            x = Integer.parseInt(arr[0]);
            y = Integer.parseInt(arr[1]);

            if(x==y){
                empate++;
            }else if(x>y){
                vitInt++;
            }else{
                vitGre++;
            }
            cont++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            selecao = Integer.parseInt(s.nextLine());
            if(selecao==2){
                break;
            }

        }
        System.out.println(cont+" grenais");
        System.out.println("Inter:"+vitInt);
        System.out.println("Gremio:"+vitGre);
        System.out.println("Empates:"+empate);
        if(vitInt==vitGre){
            System.out.println("Não houve vencedor");
        }else if(vitInt>vitGre){
            System.out.println("Inter venceu mais");
        }else{
            System.out.println("Gremio venceu mais");
        }
        s.close();
    }
}
