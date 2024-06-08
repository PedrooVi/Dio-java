public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical musicPlayer = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet safari = new NavegadorInternet();


        musicPlayer.selecionarMusica("Qualquer musica ai");
        musicPlayer.tocar();
        musicPlayer.pausar();

       
        telefone.ligar("4002-8922");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        

        safari.adicionarNovaAba();
        safari.exibirPagina("DIO/Bootcamp-BackEnd-com-Java");
        safari.atualizarPagina();
    }
}