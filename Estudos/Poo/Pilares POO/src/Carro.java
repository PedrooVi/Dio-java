public class Carro extends Veiculo{    
    public void ligar (){
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    public void confereCombustivel(){
        System.out.println("CONFERINDO COMBUSTIVEL");
    }

    public void confereCambio(){
        System.out.println("Conferindo cambio em P");
    }


}
