package tecnologias;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
	public void tocar() {
		System.out.println("Tocando");
	};
	public void pausar() {
		System.out.println("Pausando");
	};
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música chamada: " + musica);
	};
	
	public void ligar(String numero) {
		System.out.println("Ligando para o número " + numero);
	};
	public void atender() {
		System.out.println("Atendendo");
	};
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	};
	
	public void exibirPagina() {
		System.out.println("Exibindo página");
	};
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	};
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	};
}
