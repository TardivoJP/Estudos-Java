package desafios;

public class Veiculo {
	public double capacidade;
	public int passageiro;
	public double consumo;
	
	public double tanqueViagem(double quilometro) {
		return quilometro/(consumo*capacidade);
	}
	
	public double dividirDespesas(double combustivel,double quilometro) {
		return ((quilometro/consumo)*combustivel)/passageiro;
	}
	
	public String toString(double combustivel,double quilometro) {
		return "\nSerá gasto "+String.format("%.1f",tanqueViagem(quilometro))+" tanques de combustível para chegar ao destino."
				+"\nCada pessoa vai gastar R$ "+String.format("%.2f",dividirDespesas(combustivel,quilometro))+" de combustível.";
	}
	
}
