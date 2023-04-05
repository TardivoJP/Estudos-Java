import java.util.Scanner;

public class Bee1061 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int diaStart = Integer.parseInt(s.nextLine().replace("Dia ", ""));
        String arr1[] = s.nextLine().split(" : ");
        int hourStart = Integer.parseInt(arr1[0]);
        int minuteStart = Integer.parseInt(arr1[1]);
        int secondStart = Integer.parseInt(arr1[2]);

        int diaEnd = Integer.parseInt(s.nextLine().replace("Dia ", ""));
        String arr2[] = s.nextLine().split(" : ");
        int hourEnd = Integer.parseInt(arr2[0]);
        int minuteEnd = Integer.parseInt(arr2[1]);
        int secondEnd = Integer.parseInt(arr2[2]);

        int dias = diaEnd-diaStart;
        int horas,minutos,segundos;
        horas=minutos=segundos=0;

        if(hourEnd<hourStart){
            horas = (24-hourStart)+hourEnd;
            dias -= 1;    
        }else{
            horas = hourEnd-hourStart;
        }

        if(minuteEnd<minuteStart){
            minutos = (60-minuteStart)+minuteEnd;
            horas -= 1;
            if(horas<0){
                horas=23;
            }   
        }else{
            minutos = minuteEnd-minuteStart;
        }

        if(secondEnd<secondStart){
            segundos = (60-secondStart)+secondEnd;
            minutos -= 1;
            if(minutos<0){
                minutos=59;
                if(minuteEnd==minuteStart){
                    horas -= 1;
                    if(horas<0){
                        horas=23;
                    } 
                }
            }    
        }else{
            segundos = secondEnd-secondStart;
        }

        if((hourEnd==hourStart && minuteEnd<minuteStart && secondEnd<secondStart)||(hourEnd==hourStart && minuteEnd==minuteStart && secondEnd<secondStart)){
            dias -= 1;   
        }

        System.out.println(dias+" dia(s)");
        System.out.println(horas+" hora(s)");
        System.out.println(minutos+" minuto(s)");
        System.out.println(segundos+" segundo(s)");

        s.close();
    }
}
