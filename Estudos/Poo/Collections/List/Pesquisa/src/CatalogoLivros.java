import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List <Livro> listalivros;

    public CatalogoLivros() {
        this.listalivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listalivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List <Livro> pesquisarPorAutor(String autor){
        List <Livro> livrosPorAutor = new ArrayList<>();
        if(!listalivros.isEmpty()){
            for(Livro l: listalivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l); 
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();

        if(!listalivros.isEmpty()){
            for(Livro l : listalivros){
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }

        return  livrosPorIntervaloAno;
    }


    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!listalivros.isEmpty()){
            for(Livro l :listalivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogolivros = new CatalogoLivros();
        catalogolivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogolivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogolivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogolivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogolivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        catalogolivros.pesquisarPorAutor("Autor 2");
    }
}
