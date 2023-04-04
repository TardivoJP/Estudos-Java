import java.util.Scanner;

public class MultMatrizMirror {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int lin1,col1,lin2,col2,lin3,col3;
        System.out.printf("Digite o tamanho da primeira matriz:\n(Ex: 2 2 para 2x2)\n");
        String tam1[] = s.nextLine().split(" ");
        lin1 = Integer.parseInt(tam1[0]);
        col1 = Integer.parseInt(tam1[1]);

        System.out.printf("Digite o tamanho da segunda matriz:\n(Ex: 2 2 para 2x2)\n");
        String tam2[] = s.nextLine().split(" ");
        lin2 = Integer.parseInt(tam2[0]);
        col2 = Integer.parseInt(tam2[1]);

        while(col1!=lin2){
            System.out.println("Valor inválido! O número de colunas da primeira matriz deve ser igual ao número de linhas para a multiplicação ser possível!");
            System.out.println("Digite um novo número de linhas para a segunda matriz: ");
            lin2 = s.nextInt();
        }

        lin3 = lin1;
        col3 = col2;

        int matriz1[][] = new int[lin1][col1];
        int matriz2[][] = new int[lin2][col2];
        int matriz3[][] = new int[lin3][col3];

        int i,j,k;
        System.out.println("Preencha a primeira matriz "+lin1+"x"+col1+" linha por linha: ");
        for(i = 0; i<lin1; i++){
            for(j = 0; j<col1; j++){
                matriz1[i][j] = s.nextInt();
            }
        }

        System.out.println("Agora preencha a segunda matriz "+lin2+"x"+col2+" linha por linha: ");
        for(i = 0; i<lin2; i++){
            for(j = 0; j<col2; j++){
                matriz2[i][j] = s.nextInt();
            }
        }

        int total = 0;
        for(i = 0; i<lin1; i++){
            for(j = 0; j<col2; j++){
                for(k = 0; k<lin2; k++){
                    total += matriz1[i][k]*matriz2[k][j];
                }
                matriz3[i][j]=total;
                total=0;
            }
        }

        System.out.println("Matriz resultado: ");
        for(i = 0; i<lin3; i++){
            for(j = 0; j<col3; j++){
                System.out.print(matriz3[i][j]+" ");
            }
            System.out.println("");
        }
        s.close();
    }
}