import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;
import dio.gof.strategy.*;

public class Main {
    public static void main(String[] args) {
        /*Testes Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
         */

        /*Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);

        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
         */

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Bernardo", "12369741");
    }
}