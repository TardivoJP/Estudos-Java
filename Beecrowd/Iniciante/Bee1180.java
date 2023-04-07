import java.util.Scanner;

public class Bee1180 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int size = Integer.parseInt(s.nextLine());
        String arr[] = s.nextLine().split(" ");
        int menor,pos,atual;
        menor=pos=atual=0;
        for(int i=0;i<size;i++){
            atual=Integer.parseInt(arr[i]);
            if(i==0){
                menor=atual;
            }else if(atual<menor){
                menor=atual;
                pos=i;
            }
        }
        System.out.println("Menor valor: "+menor);
        System.out.println("Posicao: "+pos);
        s.close();
    }
}