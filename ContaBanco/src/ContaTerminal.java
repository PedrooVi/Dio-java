import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as menssagens para nosso usuario.
        System.out.println("Ola bem vindo ao nosso banco. ");
        System.out.println("Para começar, vamos acessar sua conta");

        // Obter pela classe Scanner os valores digitados pelo terminal.
        Double saldo = 237.48;
        System.out.println("Por favor, digite o numero de sua agencia: ");
        String numeroAgencia = scanner.next();

        System.out.println("Agora, digite o numero de sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Dihite seu nome: ");
        String nome = scanner.next();

        // Exibir a menssagem da conta criada.
        System.out
                .println("Ola " + nome + " obrigado por criar uma conta no nosso banco, sua agencia é " + numeroAgencia
                        + " conta " + numeroConta + " e seu saldo de " + saldo + " ja esta disponivel para saque.");
    }
}
