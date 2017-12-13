package core;

import factory.FactoryCaminar;
import factory.FactoryDisparar;
import implementation.CaminoNormal;
import implementation.DisparoNormal;

/**
 * Created by Esposa Mía on 17/12/2016.
 */
public class RobotMilitar extends Robot{
    private FactoryDisparar disparar;
    private FactoryCaminar caminar;

    public  RobotMilitar()
    {
        disparar = new DisparoNormal();
        caminar = new CaminoNormal();
    }
}
