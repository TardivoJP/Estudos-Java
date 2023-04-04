import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Bee1040 {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        double n1 = Double.parseDouble(arr[0]);
        double n2 = Double.parseDouble(arr[1]);
        double n3 = Double.parseDouble(arr[2]);
        double n4 = Double.parseDouble(arr[3]);
        double media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;

        DecimalFormat df = new DecimalFormat(".0");
        df.setRoundingMode(RoundingMode.DOWN);
        
        System.out.printf("Media: "+df.format(media)+"\n");
        if(media >= 7){
            System.out.printf("Aluno aprovado.\n");
        } else if(media >= 5){
            System.out.printf("Aluno em exame.\n");
            double n5 = s.nextDouble();
            System.out.printf("Nota do exame: %.1f\n",n5);
            media = (media+n5)/2;
            if(media >= 5){
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: "+df.format(media)+"\n");
            }else {
                System.out.printf("Aluno reprovado.\n");
                System.out.printf("Media final: "+df.format(media)+"\n");
            }
        } else {
            System.out.printf("Aluno reprovado.\n");
        }
        s.close();

    }

}