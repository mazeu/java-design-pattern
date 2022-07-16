package br.com.marcio.singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @author marcio
 */
public class SingletonLazyHolder {

    private static class InstanceHolder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }

}
