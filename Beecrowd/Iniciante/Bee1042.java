import java.util.Scanner;

public class Bee1042 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        int[] arrayasc = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            arrayasc[i]=Integer.parseInt(arr[i]);
        }
        int aux,cont;
        cont = aux = 0;

        for(int i=0;i<arrayasc.length*(arrayasc.length-1);i++){
            if(cont>0){
                if(arrayasc[cont]<arrayasc[cont-1]){
                    aux = arrayasc[cont-1];
                    arrayasc[cont-1]=arrayasc[cont];
                    arrayasc[cont]=aux;
                }
            }
            cont++;
            if(cont>(arrayasc.length-1)){
                cont=0;
            }
        }

        for(int i=0;i<arrayasc.length;i++){
            System.out.println(arrayasc[i]);
        }
        System.out.println();
        for(int i=0;i<arrayasc.length;i++){
            System.out.println(arr[i]);
        }
        
        s.close();
    }
}