package desafios;

import java.util.Scanner;

public class VeiculoExecInputDoUsuario {

	public static void main(String[] args) {

		Veiculo um = new Veiculo();
		Veiculo dois = new Veiculo();
		double distancia,precoCombustivel;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite a distância da viagem.");
		distancia=sc.nextDouble();
		System.out.println("Digite o preço médio do combustível.");
		precoCombustivel=sc.nextDouble();
		
		System.out.println("Insira os dados do veículo 1.");
		entrada(um);
		System.out.println("Insira os dados do veículo 2.");
		entrada(dois);
		
		System.out.println("Para o veículo 1:"+um.toString(precoCombustivel,distancia));
		System.out.println("\nPara o veículo 2:"+dois.toString(precoCombustivel,distancia));
		
		sc.close();

	}
	
	public static void entrada(Veiculo numero) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite a capacidade do tanque:");
		numero.capacidade=sc.nextDouble();
		System.out.println("Digite a quantidade de passageiros:");
		numero.passageiro=sc.nextInt();
		System.out.println("Digite o consumo médio do veículo:");
		numero.consumo=sc.nextDouble();
	}

}
