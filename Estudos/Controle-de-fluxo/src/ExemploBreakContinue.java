public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero ++){
            if (numero == 3) {
                //break;
                continue;
            }
            // Ao utilizar o break  o retorno será 2
            // Ao utilizar o continue o numero 3 não será imprimido
            System.out.println(numero);
        }
    }
}
