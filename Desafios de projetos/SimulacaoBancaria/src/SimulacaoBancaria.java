import java.util.Scanner;
import java.util.Locale;

public class SimulacaoBancaria {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha a oção desejada");
            System.out.println("1 -  Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja sacar ");
                    double valorSaque = scanner.nextDouble();

                    if (valorSaque > saldo) {
                        System.out.println("Não foi possivel realizar o saque, saldo insuficiente");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("Seu saldo atual é de R$" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Seu saldo é de: R$" + saldo);
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
