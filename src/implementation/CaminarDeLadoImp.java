package implementation;

import factory.*;

public class CaminarDeLadoImp implements FactoryCaminar {
    @Override
    public void caminar() {
        System.out.println("Yo Camino de lado");
    }
}
