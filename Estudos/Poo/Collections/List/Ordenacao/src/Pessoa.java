import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private final String nome;
    private final int idade;
    private final double altura;

    public Pessoa(double altura, int idade, String nome) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }



    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("nome=").append(nome);
        sb.append(", idade=").append(idade);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }




}

class ComparatorPorAltura implements  Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return  Double.compare(p1.getAltura(), p2.getAltura());
    }
    
}
