import java.util.Scanner;

public class MultMatriz {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o numero de linhas da primeira matriz: ");
        int lin1 = s.nextInt();
        System.out.println("Digite o numero de colunas da primeira matriz: ");
        int col1 = s.nextInt();
        System.out.println("Digite o numero de linhas da segunda matriz: ");
        int lin2 = s.nextInt();
        while(col1!=lin2){
            System.out.println("Valor inválido! O número de colunas da primeira matriz deve ser igual ao número de linhas para a multiplicação ser possível!");
            lin2 = s.nextInt();
        }
        System.out.println("Digite o numero de colunas da segunda matriz: ");
        int col2 = s.nextInt();
        int lin3 = lin1;
        int col3 = col2;
        int matriz1[][] = new int[lin1][col1];
        int matriz2[][] = new int[lin2][col2];
        int matriz3[][] = new int[lin3][col3];
        int i,j;

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

        int linha1,coluna1,linha2,coluna2,linha3,coluna3,total;
        linha1 = coluna1 = linha2 = coluna2 = linha3 = coluna3 = total = 0;

        for(i = 0; i<((lin1*col1)*col3); i++){
            total=total+((matriz1[linha1][coluna1])*(matriz2[linha2][coluna2]));
            coluna1++;
            linha2++;
            if(coluna1>=col1){
                matriz3[linha3][coluna3]=total;
                total=0;
                coluna3++;
                coluna1=0;
                linha2=0;
                coluna2++;
                if(coluna2>=col2){
                    coluna2=0;
                    linha3++;
                    coluna3=0;
                    linha1++;
                    if(linha1>=lin1){
                        break;
                    }
                }
            }
        }

        System.out.println("Matriz resultado: ");
        for(i = 0; i<lin3; i++){
            System.out.println("");
            for(j = 0; j<col3; j++){
                System.out.print(matriz3[i][j]+" ");
            }
        }
        s.close();
    }
}