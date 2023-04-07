import java.util.Scanner;

public class Bee1435 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        
        while(x!=0){
            int loops = (int) Math.ceil((double)x/2);
            int array[][]=new int[x][x];
            int k = 0;

            for(int j=0;j<loops;j++){
                for(int i=0;i<x-k;i++){
                    array[i+j][0+j]=1+j;
                    array[((x-1)-j)-i][(x-1)-j]=1+j;
                    array[(x-1)-j][i+j]=1+j;
                    array[0+j][((x-1)-j)-i]=1+j;
                }
                k+=2;
            }

            for(int i=0;i<x;i++){
                System.out.print("  ");
                for(int j=0;j<x;j++){
                    if(j == x-1){
                        System.out.println(array[i][j]); 
                    }else{
                        System.out.print(array[i][j]+"   ");
                    }
                }
            }
            System.out.println();
            x = s.nextInt();
        }
        s.close();
    }
}