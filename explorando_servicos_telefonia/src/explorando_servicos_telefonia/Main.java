package explorando_servicos_telefonia;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;
        ArrayList<String> servicosTrue = new ArrayList<>();
        
        // TODO: Itere sobre os serviços contratados
        for (String servico : servicosContratados) {
          if(servico.trim().equals("movel")){
            movelContratado = true;
            servicosTrue.add("movel");
          } else if(servico.trim().equals("banda larga")){
            bandaLargaContratada = true; 
            servicosTrue.add("banda larga");
          } else if(servico.trim().equals("tv")) {
            tvContratada = true;
            servicosTrue.add("tv");
          }
        }

        // TODO: Verifique se todos os serviços foram contratados 
        if (servicosTrue.size() == 3) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        System.out.println("Digite os serviços contratados:");
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}