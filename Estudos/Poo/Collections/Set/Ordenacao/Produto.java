package Ordenacao;

public class Produto implements Comparable<Produto> {


    private final String nome;
    private final long codProduto;
    private final double preco;
    private final int quantidade;
    
    public Produto(String nome, long codProduto, double preco, int quantidade) {
        this.nome = nome;
        this.codProduto = codProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareToIgnoreCase(p.getNome()); 
    }

    public String getNome() {
        return nome;
    }

    public long getCodProduto() {
        return codProduto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", codProduto=" + codProduto + ", preco=" + preco + ", quantidade="
                + quantidade + "]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (int) (this.codProduto ^ (this.codProduto >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return this.codProduto == other.codProduto;
    }
    

}

class ComparatorPorPreco() implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}