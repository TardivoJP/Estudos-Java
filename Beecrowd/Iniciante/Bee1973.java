import java.util.Scanner;

public class Bee1973 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int stars = s.nextInt();
        long arrnum[] = new long[stars];
        String visitados[] = new String[stars];
        long total = 0, count = 0;
        int idx=0;
        for(int i=0;i<stars;i++){
            arrnum[i]=s.nextInt();
            visitados[i]="N";
            total+=arrnum[i];
        }

        while(true){
            if(arrnum[idx] % 2 == 0){
                visitados[idx]="V";
                if(arrnum[idx]<=0){
                    idx-=1;
                }else{
                    arrnum[idx]-=1;
                    idx-=1;
                    count++;
                }
            }else{
                visitados[idx]="V";
                if(arrnum[idx]<=0){
                    idx+=1;
                }else{
                    arrnum[idx]-=1;
                    idx+=1;
                    count++;
                }
            }

            if(idx<0 || idx>(arrnum.length-1)){
                break;
            }
        }
        long visit = 0;
        for(int i=0;i<arrnum.length;i++){
            if(visitados[i].equals("V")){
                visit++;
            }
        }
        System.out.printf("%d %d\n",visit,(long)(total-count));
        s.close();
    }
}