import java.util.Scanner;

public class Bee2770 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()){
            int sizeX = s.nextInt();
            int sizeY = s.nextInt();
            int bigger = 0, smaller=0;
            if(sizeX>sizeY){
                bigger=sizeX;
                smaller=sizeY;
            }else if(sizeX<sizeY){
                bigger=sizeY;
                smaller=sizeX;
            }else{
                bigger=sizeX;
                smaller=sizeY;
            }
            int n = s.nextInt();
            for(int i=0;i<n;i++){
                int testX = s.nextInt();
                int testY = s.nextInt();
                int biggerTest = 0, smallerTest=0;
                if(testX>testY){
                    biggerTest=testX;
                    smallerTest=testY;
                }else if(testX<testY){
                    biggerTest=testY;
                    smallerTest=testX;
                }else{
                    biggerTest=testX;
                    smallerTest=testY;
                }
                if(biggerTest>bigger || smallerTest>smaller){
                    System.out.println("Nao");
                }else{
                    System.out.println("Sim");
                }
            }
        }
        s.close();
    }
}