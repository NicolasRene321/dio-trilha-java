package main;

import tecnologias.AparelhoTelefonico;
import tecnologias.Iphone;
import tecnologias.NavegadorInternet;
import tecnologias.ReprodutorMusical;

public class InicializadorSmartphone {	
	public static void main(String[] args) {
		Iphone iPhone = new Iphone();
		
		ReprodutorMusical reprodutorMusical = iPhone;
		AparelhoTelefonico aparelhoTelefonico = iPhone;
		NavegadorInternet navegadorInternet = iPhone;
		
		reprodutorMusical.selecionarMusica("Billie Jean");
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		
		System.out.println("------------------------------------------");
		
		aparelhoTelefonico.ligar("47985621456");
		aparelhoTelefonico.atender();
		aparelhoTelefonico.iniciarCorreioVoz();
		
		System.out.println("------------------------------------------");
		
		navegadorInternet.adicionarNovaAba();
		navegadorInternet.atualizarPagina();
		navegadorInternet.exibirPagina();
	}
}
