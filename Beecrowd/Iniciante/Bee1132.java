import java.util.Scanner;

public class Bee1132 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int maior,menor,total;
        maior=menor=total=0;
        if(x>y){
            maior=x;
            menor=y;
        }else{
            maior=y;
            menor=x;
        }
        for(int i = menor;i<=maior;i++){
            if(!(i % 13 == 0)){
                total+=i;
            }
        }
        System.out.println(total);
        s.close();
    }
}
