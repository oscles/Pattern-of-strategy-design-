package core;

import factory.FactoryCaminar;
import factory.FactoryDisparar;
import implementation.CaminarDeLadoImp;
import implementation.NoDisparar;

/**
 * Created by Esposa Mía on 17/12/2016.
 */
public class RobotAmigo extends Robot{
    private FactoryCaminar caminar;
    private FactoryDisparar disparar;

    public RobotAmigo()
    {
        caminar = new CaminarDeLadoImp();
        disparar = new NoDisparar();
    }
}
