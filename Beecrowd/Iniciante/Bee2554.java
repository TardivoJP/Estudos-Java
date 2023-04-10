import java.util.Scanner;

public class Bee2554 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            String linhaInicial[] = s.nextLine().split(" ");
            int dates = Integer.parseInt(linhaInicial[1]);
            boolean foundit=true;
            boolean dateset=false;
            String data="";
            for(int i=0;i<dates;i++){
                String valores[] = s.nextLine().split(" ");
                foundit=true;
                for(int j=0;j<valores.length;j++){
                    if(j!=0 && Integer.parseInt(valores[j])==0){
                        foundit=false;
                    }
                }
                if(foundit && !dateset){
                    data = valores[0];
                    dateset=true;
                }
            }
            if(dateset){
                System.out.println(data);
            }else{
                System.out.println("Pizza antes de FdI");
            }
        }
        s.close();
    }
}