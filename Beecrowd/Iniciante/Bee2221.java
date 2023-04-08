import java.util.Scanner;

public class Bee2221 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String results[] = new String[n];
		for(int i=0;i<n;i++){
			int bonus = Integer.parseInt(s.nextLine());
			String arra[] = s.nextLine().split(" ");
			double a1 = Double.parseDouble(arra[0]);
			double d1 = Double.parseDouble(arra[1]);
			double l1 = Double.parseDouble(arra[2]);
			String arrb[] = s.nextLine().split(" ");
			double a2 = Double.parseDouble(arrb[0]);
			double d2 = Double.parseDouble(arrb[1]);
			double l2 = Double.parseDouble(arrb[2]);
			double valorGolpe1=0,valorGolpe2=0;
			if(l1 % 2 ==0){
				valorGolpe1=((a1+d1)/2.0)+bonus;
			}else{
				valorGolpe1=((a1+d1)/2.0);
			}
			if(l2 % 2 ==0){
				valorGolpe2=((a2+d2)/2.0)+bonus;
			}else{
				valorGolpe2=((a2+d2)/2.0);
			}
			if(valorGolpe1>valorGolpe2){
				results[i]="Dabriel";
			}else if(valorGolpe1<valorGolpe2){
				results[i]="Guarte";
			}else{
				results[i]="Empate";
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(results[i]);
		}
        s.close();
    }
}