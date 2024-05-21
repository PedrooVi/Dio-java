public class ExemploForArray {
    public static void main(String[] args) {
        // Em arrays o indice começa em 0
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCUS"};

        /* Convenção comum usando FOR
        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice " + x + " é " + alunos[x]);
        } */

        // Convenção simplificada
        for (String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
