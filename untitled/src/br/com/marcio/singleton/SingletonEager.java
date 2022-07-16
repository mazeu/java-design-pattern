package br.com.marcio.singleton;
/**
 * Singleton "apressadoSingletonLazy"
 *
 * @author marcio
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
