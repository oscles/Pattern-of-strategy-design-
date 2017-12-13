package implementation;

import factory.FactoryDisparar;

/**
 * Created by Esposa Mía on 17/12/2016.
 */
public class DisparoNormal implements FactoryDisparar {
    @Override
    public void disparar() {
        System.out.printf("Disparando normal");
    }
}
