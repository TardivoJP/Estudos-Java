import java.util.Scanner;

public class Bee1094 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        double a,total,coelhos,ratos,sapos;
        a=total=coelhos=ratos=sapos=0;
        String animal="";

        for(int i=0; i<n; i++){
            String arr[] = s.nextLine().split(" ");
            a = Double.parseDouble(arr[0]);
            animal = arr[1];
            total+=a;
            switch(animal){
                case "C":coelhos+=a;break;
                case "R":ratos+=a;break;
                case "S":sapos+=a;break;
            }
        }
        System.out.printf("Total: %.0f cobaias\n",total);
        System.out.printf("Total de coelhos: %.0f\n",coelhos);
        System.out.printf("Total de ratos: %.0f\n",ratos);
        System.out.printf("Total de sapos: %.0f\n",sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n",(coelhos*100)/total);
        System.out.printf("Percentual de ratos: %.2f %%\n",(ratos*100)/total);
        System.out.printf("Percentual de sapos: %.2f %%\n",(sapos*100)/total);
        s.close();
    }
}
