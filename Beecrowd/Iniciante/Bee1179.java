import java.util.Scanner;

public class Bee1179 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arrpar[] = new int [5];
        int arrimpar[] = new int [5];
        int paridx,imparidx;
        paridx=imparidx=0;
        for(int i=0;i<15;i++){
            int x = s.nextInt();
            if(x % 2 == 0){
                arrpar[paridx]=x;
                paridx++;
                if(paridx>4){
                    paridx=0;
                    for(int j=0;j<5;j++){
                        System.out.println("par["+j+"] = "+arrpar[j]);
                    }
                }
            }else{
                arrimpar[imparidx]=x;
                imparidx++;
                if(imparidx>4){
                    imparidx=0;
                    for(int j=0;j<5;j++){
                        System.out.println("impar["+j+"] = "+arrimpar[j]);
                    }
                }
            }
        }
        for(int i=0;i<imparidx;i++){
            System.out.println("impar["+i+"] = "+arrimpar[i]);
        }
        for(int i=0;i<paridx;i++){
            System.out.println("par["+i+"] = "+arrpar[i]);
        } 
        s.close();
    }
}