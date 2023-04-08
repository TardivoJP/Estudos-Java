import java.util.Scanner;

public class Bee2139 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int mes = s.nextInt();
            int dia = s.nextInt();
            int totalDia=0, extraDays=0;
            if(mes==12 && dia>=24){
                if(dia==24){
                    System.out.println("E vespera de natal!");
                }
                if(dia==25){
                    System.out.println("E natal!");
                }
                if(dia>25){
                    System.out.println("Ja passou!");
                }
            }else{
                totalDia=25-dia;

                for(int i=mes;i<12;i++){
                    switch(mes){
                        case 1: extraDays++; break;
                        case 2: extraDays--; break;
                        case 3: extraDays++; break;
                        case 5: extraDays++; break;
                        case 7: extraDays++; break;
                        case 8: extraDays++; break;
                        case 10: extraDays++; break;
                    }
                    extraDays+=30;
                    mes++;
                }

                totalDia+=extraDays;

                System.out.println("Faltam "+totalDia+" dias para o natal!");
            }
        } 
        s.close();
    }
}