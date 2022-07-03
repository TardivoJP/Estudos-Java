package aplicacao;

import java.util.Scanner;

import entidades.Veiculo;

public class VeiculoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pas;
		double tanque, consumo, km, valor;
		
		System.out.println("Digite a quantidade de passageiros: ");
		pas=sc.nextInt();
		System.out.println("Digite a capacidade do tanque do veículo: ");
		tanque=sc.nextDouble();
		System.out.println("Digite o consumo por litro médio do veículo: ");
		consumo=sc.nextDouble();
		System.out.println("Digite a distância do destino em quilometros: ");
		km=sc.nextDouble();
		System.out.println("Digite o preço médio do combustível: ");
		valor=sc.nextDouble();
		
		Veiculo gurgel= new Veiculo(pas, tanque, consumo);
		System.out.println(gurgel.toString());
		
		double tanques = gurgel.tanqueViagem(km);
		double rateio = gurgel.dividirDespesas(km, valor);
		System.out.printf("\nPara a viagem vamos precisar de %.1f tanques de combustível e"
				+" cada passageiro contribuirá com R$ %.2f por pessoa.",tanques,rateio);
		
		sc.close();
	}

}
