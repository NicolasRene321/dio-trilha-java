package veiculos;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("84464");
		jeep.getChassi();
		//jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("545446");
		//z400.ligar();
		
		Veiculo coringa = z400;
		coringa.ligar();
	}
}
