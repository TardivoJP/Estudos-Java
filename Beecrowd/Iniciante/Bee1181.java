import java.util.Scanner;

public class Bee1181 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double array[][]=new double[12][12];
        int line=Integer.parseInt(s.nextLine());
        String option=s.nextLine();
        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){
                array[i][j]=s.nextDouble();
            }
        }
        double sum=0;
        for(int i=0;i<12;i++){
            sum+=array[line][i];
        }
        if("S".equalsIgnoreCase(option)){
            System.out.printf("%.1f\n",sum);
        }else if("M".equalsIgnoreCase(option)){
            System.out.printf("%.1f\n",sum/12);
        }
        s.close();
    }
}