import java.util.Scanner;

public class Bee2552 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int m = s.nextInt();
            int board[][] = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    int value = s.nextInt();
                    if(value == 1){
                        board[i][j]=9;
                    }else{
                        board[i][j]=0;
                    }
                }
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(board[i][j]==9){
                        if(i>0){
                            if(board[i-1][j]!=9){
                                board[i-1][j]++;
                            }
                        }
                        if(i<n-1){
                            if(board[i+1][j]!=9){
                                board[i+1][j]++;
                            }
                        }
                        if(j>0){
                            if(board[i][j-1]!=9){
                                board[i][j-1]++;
                            }
                        }
                        if(j<m-1){
                            if(board[i][j+1]!=9){
                                board[i][j+1]++;
                            }
                        }
                    }
                }
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
        }
        s.close();
    }
}