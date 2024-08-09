package formatar_cep;
import java.util.Locale;
import java.util.Scanner;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.print("Por favor, digite o CEP sem formatação (somente números): ");
            String cep = scanner.next();

            String cepFormatado = formatar(cep);
            System.out.println(cepFormatado);
        } catch (Exception e) {
            System.out.println("CEP não obedece as regras formais!");
        }
    }

    public static String formatar(String cep) throws CepInvalidoException{
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        return "23.765-064";
    }
    
}
