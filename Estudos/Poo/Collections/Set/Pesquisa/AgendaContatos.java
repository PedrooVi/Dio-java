package Pesquisa;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private final Set<Contatos> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone){
        contatosSet.add(new Contatos(nome, telefone));
    }

    public void exibirContatos(){
        System.out.println(contatosSet);   
    }

    public Set<Contatos> pesquisarPorNome(String nome){
        Set<Contatos> contatosPorNome = new  HashSet<>();
        for(Contatos c : contatosSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contatos atualizarNumero(String nome, int novoNumero){
        Contatos contatoAtualizado = null;
        for(Contatos c : contatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        
        agendaContatos.adicionarContato("Camila", 12345678);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumero("Maria Silva", 40028922));
        agendaContatos.exibirContatos();
        }
    
}
