import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            System.out.println("Contando ate " + contagem);
            for (int contador = 0; contador < contagem; contador++) {
                System.out.println("Imprimindo o numero " + (contador + 1));
            }
        }
    }
}
