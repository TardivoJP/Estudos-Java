import java.util.Scanner;

public class Bee2203 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int xf = s.nextInt();
			int yf = s.nextInt();
			int xi = s.nextInt();
			int yi = s.nextInt();
			int vi = s.nextInt();
			int r1 = s.nextInt();
			int r2 = s.nextInt();

			double distancia = Math.sqrt(Math.pow((xi - xf),2) + Math.pow((yi - yf),2));
			if(distancia<0){
				distancia*=-1;
			}
			double percorrido = vi + (vi*0.5);
			double distanciaTotal = distancia+percorrido;
			double alcanceTotal = r1+r2;

			if(distanciaTotal<=alcanceTotal){
				System.out.println("Y");
			}else{
				System.out.println("N");
			}
		}
        s.close();
    }
}