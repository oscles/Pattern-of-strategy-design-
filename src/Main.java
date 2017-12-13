import core.*;
import implementation.CaminarDeLadoImp;
import implementation.CaminoNormal;
import implementation.DisparoNormal;
import implementation.NoDisparar;

/**
 * Created by Esposa Mía on 17/12/2016.
 */
public class Main {

    public static void main(String args[]){
        Robot robot = new RobotAmigo();

        robot._caminar = new CaminoNormal();
        robot.caminar();
        robot._disparar = new DisparoNormal();
        robot.disparar();

        System.out.println("\n\nCambiando el comportamiento");
        robot._caminar = new CaminarDeLadoImp();
        robot.caminar();
        robot._disparar = new NoDisparar();
        robot.disparar();
    }
}
