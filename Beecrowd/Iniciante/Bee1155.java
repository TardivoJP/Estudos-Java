public class Bee1155 {
    public static void main(String args[]){
        double s = 0;
        double j = 1;
        for(int i=1;i<=100;i++){
            s=s+(1/j);
            j++;
        }
        System.out.printf("%.2f\n",s);
    }
}