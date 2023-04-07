import java.util.Scanner;

public class Bee1557 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        double test = Math.pow(2,(2*x)-2);
        int spaces = (int)(Math.log10(test)+1);
        while(x!=0){
            int array[][]=new int[x][x];
            int countline=1;
            int multiplier=0;
            for(int i=0;i<x;i++){
                multiplier=countline;
                StringBuilder rowBuilder = new StringBuilder();
                for(int j=0;j<x;j++){
                    array[i][j]=multiplier;
                    multiplier*=2;
                    rowBuilder.append(String.format("%"+spaces+"d",array[i][j]));
                    if(j!=x-1){
                        rowBuilder.append(" ");
                    }
                }
                countline*=2;
                System.out.println(rowBuilder.toString());
            }
            System.out.println();
            x = s.nextInt();
            test = Math.pow(2,(2*x)-2);
            spaces = (int)(Math.log10(test)+1);
        }
        s.close();
    }
}