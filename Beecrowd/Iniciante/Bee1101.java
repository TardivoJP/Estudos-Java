import java.util.ArrayList;
import java.util.Scanner;

public class Bee1101 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        ArrayList<String> valores = new ArrayList<String>();
        int x,y,maior,menor,soma,skipone;
        soma=0;
        x=y=1;

        while(x>0 && y>0){
            String arr[] = s.nextLine().split(" ");
            x = Integer.parseInt(arr[0]);
            y = Integer.parseInt(arr[1]);
            if(x>0 && y>0){
                maior = x;
                menor = y;
                if(x>y){
                    maior=x;
                    menor=y;
                }else{
                    maior=y;
                    menor=x;
                }
                for(int j = menor; j<=maior; j++){
                    valores.add(String.valueOf(j));
                    soma+=j;
                }
                valores.add("FIM");
                valores.add(String.valueOf(soma));
                soma=0;
            }
        }

        boolean fimnums=false;
        skipone=0;
        for(int i=0;i<valores.size();i++){
            if(valores.get(i)=="FIM"){
                fimnums=true;
            }

            if(!fimnums){
                System.out.print(valores.get(i)+" ");
            }else{
                skipone++;
            }

            if(skipone==2){
                skipone=0;
                fimnums=false;
                System.out.println("Sum="+valores.get(i));
            }
        }
        
        s.close();
    }
}
