package desafios;

import java.util.Scanner;

public class Desafio1_1 {

	public static void main(String[] args) {
		
		double precUnit,precImp,margemLuc,totalValor=0,totalImp=0,totalMargem=0;
		double tVc=0,tIc=0,tMc=0,tVe=0,tIe=0,tMe=0,tVv=0,tIv=0,tMv=0;
		int estoque,totalEstoque=0,contador,qtdC=0,qtdE=0,qtdV=0,tEc=0,tEe=0,tEv=0;
		char categoria;
		Scanner sc = new Scanner(System.in);
		
		for (contador=1; contador<=15; contador++) {
			System.out.printf("\nDigite o preço unitário do %dº produto: ",contador);
			precUnit = sc.nextDouble();
			
			System.out.printf("\nDigite a quantidade do %dº produto: ",contador);
			estoque = sc.nextInt();
			
			System.out.printf("\nDigite a categoria do %dº produto: ",contador);
			categoria = sc.next().charAt(0);
			categoria = Character.toUpperCase(categoria);
			
			while (categoria != 'C' && categoria != 'E'&& categoria != 'V') {
				System.out.printf("\nCategoria inválida!");
				System.out.printf("\nUtilize apenas C, E ou V");
				System.out.printf("\nDigite a categoria do %dº produto: ",contador);
				categoria = sc.next().charAt(0);
				categoria = Character.toUpperCase(categoria);
			}
			
			switch (categoria) {
			case 'C':
				tEc += estoque;
				totalEstoque += estoque;
				
				qtdC++;
				totalValor += precUnit;
				tVc += precUnit;
				System.out.printf("\nValor do %dº produto: R$%.2f",contador,precUnit);
				
				precImp = precUnit * 0.3741;
				totalImp += precImp;
				tIc += precImp;
				System.out.printf("\nValor do imposto do %dº produto: R$%.2f",contador,precImp);
				
				precUnit -= precImp;
				System.out.printf("\nValor do %dº produto menos impostos: R$%.2f",contador,precUnit);
				margemLuc = precUnit * 0.3;
				System.out.printf("\nValor da margem de lucro do %dº produto: R$%.2f\n\n",contador,margemLuc);
				totalMargem += margemLuc;
				tMc += margemLuc;
				break;
				
			case 'E':
				tEe += estoque;
				totalEstoque += estoque;
				
				qtdE++;
				totalValor += precUnit;
				tVe += precUnit;
				System.out.printf("\nValor do %dº produto: R$%.2f",contador,precUnit);
				
				precImp = precUnit * 0.4314;
				totalImp += precImp;
				tIe += precImp;
				System.out.printf("\nValor do imposto do %dº produto: R$%.2f",contador,precImp);
				
				precUnit -= precImp;
				System.out.printf("\nValor do %dº produto menos impostos: R$%.2f",contador,precUnit);
				margemLuc = precUnit * 0.35;
				System.out.printf("\nValor da margem de lucro do %dº produto: R$%.2f\n\n",contador,margemLuc);
				totalMargem += margemLuc;
				tMe += margemLuc;
				break;
				
			case 'V':
				tEv += estoque;
				totalEstoque += estoque;
				
				qtdV++;
				totalValor += precUnit;
				tVv += precUnit;
				System.out.printf("\nValor do %dº produto: R$%.2f",contador,precUnit);
				
				precImp = precUnit * 0.3842;
				totalImp += precImp;
				tIv += precImp;
				System.out.printf("\nValor do imposto do %dº produto: R$%.2f",contador,precImp);
				
				precUnit -= precImp;
				System.out.printf("\nValor do %dº produto menos impostos: R$%.2f",contador,precUnit);
				margemLuc = precUnit * 0.5;
				System.out.printf("\nValor da margem de lucro do %dº produto: R$%.2f\n\n",contador,margemLuc);
				totalMargem += margemLuc;
				tMv += margemLuc;
				break;
			}
			
		}
		
		
		System.out.printf("\n\n\nDos 15 tipos de produtos: ");
		
		if (qtdC != 0) {
			System.out.printf("\n\n%d são da categoria cama, mesa e banho, totalizando %d unidades, no valor de R$%.2f bruto, "
					+ "com R$%.2f impostos e R$%.2f de margem de lucro.",qtdC,tEc,tVc,tIc,tMc);
		}
		
		if (qtdE != 0) {
			System.out.printf("\n\n%d são da categoria eletrodoméstico, totalizando %d unidades, no valor de R$%.2f bruto, "
					+ "com R$%.2f impostos e R$%.2f de margem de lucro.",qtdE,tEe,tVe,tIe,tMe);
		}
		
		if (qtdV != 0) {
			System.out.printf("\n\n%d são da categoria vestuário, totalizando %d unidades, no valor de R$%.2f bruto, "
					+ "com R$%.2f impostos e R$%.2f de margem de lucro.",qtdV,tEv,tVv,tIv,tMv);
		}	
		
		System.out.printf("\n\n\nO total geral de todos os 15 tipos de produtos é: ");
		System.out.printf("\n%d unidades, no valor de R$%.2f bruto, "
				+ "com R$%.2f impostos e R$%.2f de margem de lucro.",totalEstoque,totalValor,totalImp,totalMargem);
		
		
		sc.close();

	}

}
