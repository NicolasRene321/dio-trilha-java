package default1;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("123", "MARCOS");
		
		marcos.setEndereco("RUA DAS MARIAS");
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
