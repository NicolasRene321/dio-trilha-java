package formatarCep;

public class FormatadorCep {
	public static void main(String[] args) {
		try {
			String cepFormatado = formatar("21515512");
			System.out.println(cepFormatado);
		} catch (CepInvalidoException e) {
			System.out.println("CEP não segue as regras formais!");
		}
	}
	
	public static String formatar(String cep) throws CepInvalidoException {
		if (cep.length() != 8) {
			throw new CepInvalidoException();
		}
		
		return "279.895-89";
	}
}