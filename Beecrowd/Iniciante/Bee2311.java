import java.util.Scanner;

public class Bee2311 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String results[] = new String[n];
		for(int i=0;i<n;i++){
			String nome = s.nextLine();
			double diff = Double.parseDouble(s.nextLine());
			String notas[] = s.nextLine().split(" ");
			double maior = Double.parseDouble(notas[0]);
			double menor = Double.parseDouble(notas[0]);
			for(int j=0;j<notas.length;j++){
				if(Double.parseDouble(notas[j])>maior){
					maior=Double.parseDouble(notas[j]);
				}
				if(Double.parseDouble(notas[j])<menor){
					menor=Double.parseDouble(notas[j]);
				}
			}
			double sum = 0;
			for(int j=0;j<notas.length;j++){
				if(!(Double.parseDouble(notas[j])==menor || Double.parseDouble(notas[j])==maior)){
					sum+=Double.parseDouble(notas[j]);
				}
			}
			sum*=diff;
			results[i] = String.format("%s %.2f",nome,sum);
		}
		for(int i=0;i<n;i++){
			System.out.println(results[i]);
		}
        s.close();
    }
}