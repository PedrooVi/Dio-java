

import Facade.Facade;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class Test {
    public static void main(String[] args) {

        //Singleton 
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        

        //Strategy 
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();   
        Comportamento agressivo = new ComportamentoAgressivo();
        Robo robo = new Robo();
        robo.setcomportamento(agressivo);
        robo.mover();
        robo.setcomportamento(defensivo);
        robo.mover();
        robo.setcomportamento(normal);
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Pedro", "22042-011");

    }
}
