import java.util.Scanner;

public class Bee1534 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        while(s.hasNext()){
            int x = s.nextInt();
            int array[][]=new int[x][x];
            for(int i=0;i<x;i++){
                for(int j=0;j<x;j++){
                    array[i][j]=3;
                    if(i==j){
                        array[i][j]=1;
                    }
                    if(j==x-(i+1)){
                        array[i][j]=2;
                    }
                    if(j == x-1){
                        System.out.println(array[i][j]); 
                    }else{
                        System.out.print(array[i][j]);
                    }
                }
            }
        }
        s.close();
    }
}