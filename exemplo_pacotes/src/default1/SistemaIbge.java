package default1;

public class SistemaIbge {
	public static void main(String[] args) {
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getIbge());
		}
		
		EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;
		System.out.println("Estado individual: " + eb.getSigla() + " - " + eb.getNome() + " - " + eb.getNomeMaiusculo() + " - " + eb.getIbge());
	}
}
