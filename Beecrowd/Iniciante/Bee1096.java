public class Bee1096 {
    public static void main(String args[]){
        int i=1;
        int j=7;
        int contador=0;
        while(i<10){
            System.out.println("I="+i+" J="+j);
            j--;
            contador++;
            if(contador>2){
                i+=2;
                j+=3;
                contador=0;
            }
        }
    }
}
