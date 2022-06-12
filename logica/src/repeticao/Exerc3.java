package repeticao;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		
		double base,altura,area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do triângulo: ");
		base = sc.nextDouble();
		
		while (base <= 0) {
			System.out.println("Valor inválido!");
			System.out.println("Digite um valor maior que 0 para a base do triângulo: ");
			base = sc.nextDouble();
		}
		
		System.out.println("Digite o valor da altura do triângulo: ");
		altura = sc.nextDouble();
		
		while (altura <= 0) {
			System.out.println("Valor inválido!");
			System.out.println("Digite um valor maior que 0 para a altura do triângulo: ");
			altura = sc.nextDouble();
		}
		
		area = (base*altura)/2;
		
		System.out.printf("\nA área do triângulo é: %.2f.",area);
		
		sc.close();

	}

}
