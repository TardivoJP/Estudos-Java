import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Bee1098 {
    public static void main(String args[]){
        double i=0;
        double j=1;
        int contador=0;
        NumberFormat nf = new DecimalFormat("##.###");

        while(i<2){
            System.out.println("I="+nf.format(i)+" J="+nf.format(j));
            j++;
            contador++;
            if(contador>2){
                i+=0.2;
                j-=2.8;
                contador=0;
            }
        }
    }
}
