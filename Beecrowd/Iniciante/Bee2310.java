import java.util.Scanner;

public class Bee2310 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		double totalSaques=0,totalBloqueios=0,totalAtaques=0;
		double successSaques=0,successBloqueios=0,successAtaques=0;
		for(int i=0;i<n;i++){
			String nomeIrrelevante = s.nextLine();
			String valoresTotais[] = s.nextLine().split(" ");
			totalSaques += Double.parseDouble(valoresTotais[0]);
			totalBloqueios += Double.parseDouble(valoresTotais[1]);
			totalAtaques += Double.parseDouble(valoresTotais[2]);
			String valoresSuccess[] = s.nextLine().split(" ");
			successSaques += Double.parseDouble(valoresSuccess[0]);
			successBloqueios += Double.parseDouble(valoresSuccess[1]);
			successAtaques += Double.parseDouble(valoresSuccess[2]);
		}
		double porcentSaques = (successSaques*100)/totalSaques;
		double porcentBloqueios = (successBloqueios*100)/totalBloqueios;
		double porcentAtaques = (successAtaques*100)/totalAtaques;
		System.out.printf("Pontos de Saque: %.2f %%.\n",porcentSaques);
		System.out.printf("Pontos de Bloqueio: %.2f %%.\n",porcentBloqueios);
		System.out.printf("Pontos de Ataque: %.2f %%.\n",porcentAtaques);
        s.close();
    }
}