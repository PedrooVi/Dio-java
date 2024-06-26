import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Curso curso1 = new Curso();
       curso1.setTitulo("Curso Java");
       curso1.setDescricao("descricao curso Java");
       curso1.setCargaHoraria(8);

       Curso curso2 = new Curso();
       curso2.setTitulo("Curso JS");
       curso2.setDescricao("descricao curso JS");
       curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descricao mentoria de Java");
        mentoria.setData(LocalDate.now());
        

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("---------");
        System.out.println("Conteudos inscritos dev Camila: " + devCamila.getConteudosInscritos());

        devCamila.progredir();

        System.out.println("---------");
        System.out.println("Conteudos concluidos dev Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
        System.out.println("---------");


        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("---------");
        System.out.println("Conteudos inscritos dev Pedro: " + devPedro.getConteudosInscritos());

        devPedro.progredir();
        System.out.println("---------");
        System.out.println("Conteudos concluidos dev Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());
        System.out.println("---------");
    }
}
