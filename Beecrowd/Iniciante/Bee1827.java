import java.util.Scanner;

public class Bee1827 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        while(s.hasNext()){
            int size = s.nextInt();
            int array[][] = new int[size][size];
            int meio = (int) Math.ceil((double)size/2);
            int interno = size/3;

            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    array[i][j]=0;
                    
                    if(i==j){
                        array[i][j]=2;    
                    }

                    if(j==size-(i+1)){
                        array[i][j]=3;
                    }

                    if(i>=interno && j>=interno && j<=(size-interno-1) && i<=(size-interno-1)){
                        array[i][j]=1;
                    }

                    if(size % 2 != 0 && i == meio-1 && j == meio-1){
                        array[i][j]=4;
                    }
                    if(j == size-1){
                        System.out.println(array[i][j]); 
                    }else{
                        System.out.print(array[i][j]);
                    }
                }
            }
            System.out.println();
        }
        s.close();
    }
}