import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.print("Qual é a sua agência? ");
        agencia = scanner.next();

        System.out.print("Digite o seu nome: ");
        nomeCliente = scanner.next();

        System.out.print("Digite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta" + numero + " e seu saldo 10" + saldo + " já está disponível para saque.");
        
    }
}
