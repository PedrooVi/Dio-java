import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private final List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }


    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(altura, idade, nome));
    }

    public List<Pessoa>ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new  ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;    
    }


    public List<Pessoa>ordernarPorAltura(){
        List<Pessoa> pessoaPorAltura = new  ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new  ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenarPessoas = new OrdenacaoPessoas();
        ordenarPessoas.adicionarPessoa("Nome 1", 20, 1.56);
        ordenarPessoas.adicionarPessoa("Nome 2", 30, 1.80);
        ordenarPessoas.adicionarPessoa("Nome 3", 25, 1.70);
        ordenarPessoas.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenarPessoas.ordenarPorIdade());
        System.out.println(ordenarPessoas.ordernarPorAltura());
    }
}
