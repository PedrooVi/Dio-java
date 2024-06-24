public class Main {
    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");

        Conta cc = new ContaCorrente(pedro);
        cc.depositar(100);
       
        Conta poupanca = new ContaPoupanca(pedro);
        cc.transferir(100, poupanca);


       cc.imprimirExtrato();
       poupanca.imprimirExtrato();
    }
}
