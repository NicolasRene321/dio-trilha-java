package desafio_dio_banco;

public class Main {
	public static void main(String[] args) {
		Cliente nicolas = new Cliente();
		nicolas.setNome("Venilton");
		
		Conta cc = new ContaCorrente(nicolas);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(nicolas);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
