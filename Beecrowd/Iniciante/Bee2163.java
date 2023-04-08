import java.util.Scanner;

public class Bee2163 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int matriz[][] = new int[n][m];
		boolean achou = false;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				matriz[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(i!=0 && i!=(n-1) && j!=0 && j!=(m-1) && matriz[i][j]==42){
					if(matriz[i][j-1]==7 && matriz[i-1][j-1]==7 && matriz[i-1][j]==7 && matriz[i-1][j+1]==7 && matriz[i][j+1]==7 && matriz[i+1][j+1]==7 && matriz[i+1][j]==7 && matriz[i+1][j-1]==7){
						System.out.println((i+1)+" "+(j+1));
						achou = true;
					}
				}
			}
		}
		if(!achou){
			System.out.println("0 0");
		}
        s.close();
    }
}