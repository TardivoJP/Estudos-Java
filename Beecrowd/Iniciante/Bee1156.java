public class Bee1156 {
    public static void main(String args[]){
        double s = 0;
        double j = 1;
        double k = 1;
        while(k<=39){
            s=s+(k/j);
            k+=2;
            j*=2;
        }
        System.out.printf("%.2f\n",s);
    }
}