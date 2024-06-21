package Pesquisa;

import java.util.Objects;

public class Contatos {
    private final String nome;
    private  int telefone;

    public Contatos(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }



    @Override
    public String toString() {
        return "{ " + nome + ", " + telefone + "}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nome);
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
        final Contatos other = (Contatos) obj;
        return Objects.equals(this.nome, other.nome);
    }


    
}
