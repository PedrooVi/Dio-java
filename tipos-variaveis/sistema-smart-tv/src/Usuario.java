public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.abaixarVolume();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.mudarCanal(12);
        System.out.println("Mudando para canal: " + smartTv.canal);
    }

}
