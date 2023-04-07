import java.util.Scanner;

public class Bee1478 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        
        while(x!=0){
            int array[][]=new int[x][x];
            int countline;
            for(int i=0;i<x;i++){
                countline=1;
                System.out.print("  ");
                for(int j=0;j<x;j++){
                    if(j>=i){
                        array[i][j]=countline;
                        countline++;
                    }
                    if(j<i){
                        array[i][j]=(i+1)-j;
                    }
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