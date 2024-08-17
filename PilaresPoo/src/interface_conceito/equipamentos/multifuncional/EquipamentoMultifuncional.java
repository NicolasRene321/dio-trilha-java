package interface_conceito.equipamentos.multifuncional;

import interface_conceito.equipamentos.copiadora.Copiadora;
import interface_conceito.equipamentos.digitalizadora.Digitalizadora;
import interface_conceito.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora{

	public void digitalizar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}
	public void copiar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}
	
}
