public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Voce sacou R$" + valorSolicitado + " seu saldo atual é de: R$" + saldo);
        }
    }
}
