import java.util.Scanner;

public class Bee2766 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nomes[] = new String[3];
        for(int i=0;i<10;i++){
            switch(i){
                case 2: nomes[0]=s.nextLine(); break;
                case 6: nomes[1]=s.nextLine(); break;
                case 8: nomes[2]=s.nextLine(); break;
                default: String dummy = s.nextLine(); break;
            }
        }
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        s.close();
    }
}