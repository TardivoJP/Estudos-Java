package condicional;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
		double qtdAulas,n1,n2,n3,n4,faltas,porcFaltas,media;
		String nomeMateria;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe o nome da matéria: ");
		nomeMateria = sc.next();
		System.out.println("Informe a quantidade de aulas desta matéria: ");
		qtdAulas = sc.nextDouble();
		System.out.println("Informe a nota do 1º Bimestre: ");
		n1 = sc.nextDouble();
		System.out.println("Informe a nota do 2º Bimestre: ");
		n2 = sc.nextDouble();
		System.out.println("Informe a nota do 3º Bimestre: ");
		n3 = sc.nextDouble();
		System.out.println("Informe a nota do 4º Bimestre: ");
		n4 = sc.nextDouble();
		System.out.println("Informe a quantidade de faltas: ");
		faltas = sc.nextDouble();
		
		porcFaltas = (faltas*100)/qtdAulas;
		media = (n1+n2+n3+n4)/4;
		
		if (media >= 6.0 && porcFaltas <= 25.0) {
			System.out.printf("O aluno foi aprovado na matéria %s com a média %f e a porcentagem de %f faltas.",nomeMateria,media,porcFaltas);
		} else {
			System.out.printf("O aluno foi reprovado na matéria %s com a média %f e a porcentagem de %f faltas.",nomeMateria,media,porcFaltas);
		}
		
		
		sc.close();

	}

}
