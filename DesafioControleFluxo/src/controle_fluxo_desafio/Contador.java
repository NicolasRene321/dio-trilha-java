package controle_fluxo_desafio;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();	
		
		try {
			contar(numero1, numero2);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
		}
	}
	
	public static void contar(int n1, int n2) throws ParametrosInvalidosException {
		if (n1 < n2) {
			int repeticoes = (n2 - n1) + 1;
			
			for(int i = 1; i < repeticoes; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		} else {
			throw new ParametrosInvalidosException();
		}
	}
}
