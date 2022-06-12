package sequencial;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
		double n1,n2,n3,n4,p1,p2,p3,p4,mediaPonderada;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de N1: ");
		n1 = sc.nextDouble();
		System.out.println("Informe o peso de N1: ");
		p1 = sc.nextDouble();
		
		System.out.println("Informe o valor de N2: ");
		n2 = sc.nextDouble();
		System.out.println("Informe o peso de N2: ");
		p2 = sc.nextDouble();
		
		System.out.println("Informe o valor de N3: ");
		n3 = sc.nextDouble();
		System.out.println("Informe o peso de N3: ");
		p3 = sc.nextDouble();
		
		System.out.println("Informe o valor de N4: ");
		n4 = sc.nextDouble();
		System.out.println("Informe o peso de N4: ");
		p4 = sc.nextDouble();
		
		mediaPonderada = ((n1*p1)+(n2*p2)+(n3*p3)+(n4*p4))/(p1+p2+p3+p4);
		System.out.printf("A média ponderada de %.2f com peso %.2f, %.2f com peso %.2f, %.2f com peso %.2f e %.2f com peso %.2f é %.3f",n1,p1,n2,p2,n3,p3,n4,p4,mediaPonderada);
		
		
		sc.close();

	}

}
