package core;

import factory.FactoryCaminar;
import factory.FactoryDisparar;

public abstract class Robot {
    public FactoryCaminar _caminar;
    public FactoryDisparar _disparar;

    public  Robot(){}

    public Robot(FactoryCaminar _caminar, FactoryDisparar _disparar) {
        this._caminar = _caminar;
        this._disparar = _disparar;
    }

    public void disparar() {
        _disparar.disparar();
    }

    public void caminar(){
        _caminar.caminar();
    }
}
