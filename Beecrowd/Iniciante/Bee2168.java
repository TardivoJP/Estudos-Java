import java.util.Scanner;

public class Bee2168 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int truesize = n+1;
		int safe=0, count =0;
		int matriz[][] = new int[truesize][truesize]; 
		for(int i=0;i<n+1;i++){
			for(int j=0;j<n+1;j++){
				matriz[i][j]=s.nextInt();
			}
		}

		for(int i=0;i<n;i++){
			safe=0;
			count=0;
			for(int j=0;j<truesize;j++){
				if(matriz[i][j]==1){
					safe++;
				}
				if(matriz[i+1][j]==1){
					safe++;
				}

				if(j>1){
					if(matriz[i][j-1]==1){
						safe++;
					}
					if(matriz[i+1][j-1]==1){
						safe++;
					}
					count++;
				}
				count++;
				if(count>1){
					count=0;
					if(safe>=2){
						System.out.print("S");
					}else{
						System.out.print("U");
					}
					safe=0;
				}
			}
			System.out.println();
		}
        s.close();
    }
}