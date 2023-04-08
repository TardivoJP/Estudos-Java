import java.text.DecimalFormat;
import java.util.Scanner;

public class Bee2029 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            DecimalFormat df = new DecimalFormat("0.00");
            double volume = s.nextDouble();
            double diametro = s.nextDouble();
            double area = 3.14*(Math.pow(diametro/2,2));
            double altura = volume/area;
            System.out.println("ALTURA = "+df.format(altura));
            System.out.println("AREA = "+df.format(area));
        }
        s.close();
    }
}