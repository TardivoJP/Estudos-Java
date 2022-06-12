package repeticao;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		int contador=2015;
		double salario,novoSalario=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salario = sc.nextDouble();
		
		while (contador < 2022) {
			switch (contador) {
			case 2015:
				novoSalario=salario*1.088;
				break;
			case 2016:
				novoSalario=novoSalario*1.1167;
				break;
			case 2017:
				novoSalario=novoSalario*1.0647;
				break;
			case 2018:
				novoSalario=novoSalario*1.0181;
				break;
			case 2019:
				novoSalario=novoSalario*1.0461;
				break;
			case 2020:
				novoSalario=novoSalario*1.0468;
				break;
			case 2021:
				novoSalario=novoSalario*1.0526;
				break;
			case 2022:
				novoSalario=novoSalario*1.01;
				break;
			}
			contador++;
		}
		
		System.out.printf("\n\nO salário de R$%.2f corrigido de 2015 para 2022 com base nos percentuais de aumento do"
				+ " salário mínimo é R$%.2f",salario,novoSalario);
		
		sc.close();

	}

}
