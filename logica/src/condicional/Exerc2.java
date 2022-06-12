package condicional;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		double salario,desconto,valorFinal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário: ");
		salario = sc.nextDouble();
		
		if (salario <= 1903.98) {
			System.out.printf("Salário R$.2f isento de imposto de renda, logo o desconto é 0",salario);
		} else if (salario <= 2826.65) {
			desconto = salario*0.075;
			valorFinal = salario-desconto;
			System.out.printf("Salário R$%.2f com alíquota de 7.5%% imposto de renda, logo o desconto "
					+ "é R$%.2f resultando em um valor final de R$%.2f",salario,desconto,valorFinal);			
		} else if (salario <= 3751.06) {
			desconto = salario*0.15;
			valorFinal = salario-desconto;
			System.out.printf("Salário R$%.2f com alíquota de 15%% imposto de renda, logo o desconto "
					+ "é R$%.2f resultando em um valor final de R$%.2f",salario,desconto,valorFinal);			
		} else if (salario <= 4664.68) {
			desconto = salario*0.225;
			valorFinal = salario-desconto;
			System.out.printf("Salário R$%.2f com alíquota de 22.5%% imposto de renda, logo o desconto "
					+ "é R$%.2f resultando em um valor final de R$%.2f",salario,desconto,valorFinal);			
		} else {
			desconto = salario*0.275;
			valorFinal = salario-desconto;
			System.out.printf("Salário R$%.2f com alíquota de 27.5%% imposto de renda, logo o desconto "
					+ "é R$%.2f resultando em um valor final de R$%.2f",salario,desconto,valorFinal);			
		} 
		
		sc.close();

	}

}
