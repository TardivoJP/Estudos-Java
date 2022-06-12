package repeticao;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
		double nota,total=0,media;
		int contador,aprovados=0,reprovados=0;
		Scanner sc = new Scanner(System.in);
		
		for (contador = 0; contador <= 9; contador ++) {
			System.out.printf("Digite a nota do %dº aluno\n",contador+1);
			nota = sc.nextDouble();
			
			if (nota >= 6.0) {
				aprovados++;
			} else {
				reprovados++;
			}
			
			total += nota;
		}
		
		media = total/10;
		
		System.out.printf("\n\nA quantidade de alunos aprovados é: %d\n",aprovados);
		System.out.printf("\nA quantidade de alunos reprovados é: %d\n",reprovados);
		System.out.printf("\nA média da turma é: %.2f\n",media);
		
		
		sc.close();

	}

}
