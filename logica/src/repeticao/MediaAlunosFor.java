package repeticao;

import java.util.Scanner;

public class MediaAlunosFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		int contador;
		
		for (contador = 0; contador <= 9; contador ++) {
			System.out.printf("\nDigite a %dª nota",contador+1);
			double nota = sc.nextDouble();
			total += nota;
		}
		
		double media = total / contador;
		
		System.out.printf("\n\nTotal de alunos na classe %d\n",contador);
		System.out.printf("\nO total de notas dos alunos: %.1f\n",total);
		System.out.printf("\nA média da classe: %.1f\n",media);
		
		sc.close();

	}

}
