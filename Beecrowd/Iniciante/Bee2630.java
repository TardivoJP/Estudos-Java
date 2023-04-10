import java.util.Scanner;

public class Bee2630{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            String opt = s.next();
            int RGB[] = new int[3];
            RGB[0] = s.nextInt();
            RGB[1] = s.nextInt();
            RGB[2] = s.nextInt();
            String truncated = "";
            switch(opt){
                case "eye": 
                    double eye = ((double)(((double)(RGB[0]*0.3))+((double)(RGB[1]*0.59))+((double)(RGB[2]*0.11))));
                    truncated = String.valueOf((int) eye);
                    System.out.printf("Caso #%d: %s\n",i+1,truncated);
                break;
                case "mean": 
                    double media = ((double)(((double)(RGB[0]+RGB[1]+RGB[2]))/((double)(3))));
                    truncated = String.valueOf((int) media);
                    System.out.printf("Caso #%d: %s\n",i+1,truncated);
                break;
                case "min": 
                    int min = RGB[0];
                    for(int j=0;j<3;j++){
                        if(RGB[j]<min){
                            min=RGB[j];
                        }
                    }
                    System.out.printf("Caso #%d: %d\n",i+1,min);
                break;
                case "max": 
                    int max = RGB[0];
                    for(int j=0;j<3;j++){
                        if(RGB[j]>max){
                            max=RGB[j];
                        }
                    }
                    System.out.printf("Caso #%d: %d\n",i+1,max);
                break;
            }
        }
        s.close();
    }
}