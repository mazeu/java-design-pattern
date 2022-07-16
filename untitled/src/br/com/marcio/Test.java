package br.com.marcio;

import br.com.marcio.facade.Facade;
import br.com.marcio.singleton.SingletonEager;
import br.com.marcio.singleton.SingletonLazy;
import br.com.marcio.singleton.SingletonLazyHolder;
import br.com.marcio.strategy.*;

public class Test {

    public static void main(String[] args){


        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println("-----------------------------------");

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        eager = SingletonEager.getInstance();
        System.out.println(eager);

        System.out.println("-----------------------------------");

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);


        //-------------------------------------

        //strategy
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");

        Facade facade = new Facade();
        facade.migrarCliente("Felipe","12221488");
    }
}
