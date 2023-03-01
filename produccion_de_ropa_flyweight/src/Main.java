import Models.FlyweightesFactorys.RopaFlyWeightFactory;
import Models.LocalRopa;
import Models.Ropa;

public class Main {
    public static void main(String[] args) {
        LocalRopa localRopa = new LocalRopa("puflitos");
        localRopa.crearRopa("pantalon");
    }
}
