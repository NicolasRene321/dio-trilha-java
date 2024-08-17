package interface_conceito.estabelecimento;

import interface_conceito.equipamentos.copiadora.Copiadora;
import interface_conceito.equipamentos.digitalizadora.Digitalizadora;
import interface_conceito.equipamentos.impressora.Impressora;
import interface_conceito.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();	
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
