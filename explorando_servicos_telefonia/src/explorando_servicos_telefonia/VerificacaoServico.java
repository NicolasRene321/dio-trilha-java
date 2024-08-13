package explorando_servicos_telefonia;

import java.util.Scanner;

public class VerificacaoServico {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        System.out.print("Informe o serviço a ser verificado: ");
        String servico = scanner.nextLine();
        
        // Entrada do nome do cliente e os serviços contratados
        System.out.print("Informe o nome do cliente e, em seguida, os serviços contratados: ");
        String entradaCliente = scanner.nextLine();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        System.out.println(verificarServicos(servico, partes));
        
        scanner.close();
    }
	
	public static String verificarServicos(String servico, String[] partes) {
		for(int i = 0; i < partes.length; i++) {
			if (partes[i].trim().equals(servico)) {
				return "Sim";
			}
		}
		
		return "Não";
	}
}
