package sequencial;

import java.util.Scanner;

public class Aumento2 {

	public static void main(String[] args) {
		
		double percentual,salarioBruto,salarioNovo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário: ");
		salarioBruto = sc.nextDouble();
		
		System.out.println("Informe o percentual de aumento: ");
		percentual = sc.nextDouble();
		
		salarioNovo = salarioBruto*(1+percentual/100);
		
		System.out.printf("O salário R$%.2f com o percentual de aumento %.1f é R$%.2f",salarioBruto,percentual,salarioNovo);
		
		sc.close();

	}

}
