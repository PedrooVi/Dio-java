import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        for(String candidato: candidatos ){
            System.out.println("Entrando em contato com " + candidato);
            entrandoEmContato(candidato);
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void selecionarCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o salario de: R$" + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatosSelecionados ++;
            }
            candidatoAtual ++;
        }
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o numero de elementos");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato n° " + (indice+1) + " é : " + candidatos[indice]);
        }


        // Forma abreviada de usar o FOR
        System.out.println("Forma abreviada de interação (ForEach)");

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi: " + candidato);
        } 

    }

    static void entrandoEmContato (String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        
        do{
            atendeu = atender();
            continuaTentando = !atendeu;

            if(continuaTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO!!");
            }

        }while(continuaTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Cnseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        } else{
            System.out.println("Não conseguimos contato com " + candidato + " numero de tentativas realizadas: " + tentativasRealizadas);
        }

    }

    static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
}
