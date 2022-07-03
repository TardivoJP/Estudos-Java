package desafios;

public class VeiculoExec {

	public static void main(String[] args) {

		Veiculo um = new Veiculo();
		Veiculo dois = new Veiculo();
		
		um.capacidade=90;
		um.passageiro=16;
		um.consumo=9;
		
		dois.capacidade=56;
		dois.passageiro=5;
		dois.consumo=9;
		
		double distancia,precoCombustivel;
		distancia=628;
		precoCombustivel=6.60;
		
		System.out.println("Para o veículo 1:"+um.toString(precoCombustivel,distancia));
		System.out.println("\nPara o veículo 2:"+dois.toString(precoCombustivel,distancia));

	}

}
