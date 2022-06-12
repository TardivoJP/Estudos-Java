package sequencial;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		double salarioBruto,desconto,novoSalario;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário: ");
		salarioBruto = sc.nextDouble();
		
		System.out.println("Informe o percentual de desconto: ");
		desconto = sc.nextDouble();
		
		novoSalario = salarioBruto*(1-(desconto/100));
		System.out.printf("O salário R$%.2f com o desconto de %.1f é R$%.2f",salarioBruto,desconto,novoSalario);
		
		sc.close();

	}

}
