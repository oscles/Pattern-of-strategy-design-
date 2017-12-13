package implementation;

import factory.FactoryDisparar;

/**
 * Created by Esposa Mía on 17/12/2016.
 */
public class NoDisparar implements FactoryDisparar {
    @Override
    public void disparar() {
        System.out.printf("no puedo disparar");
    }
}
