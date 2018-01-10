package racing.car;

/**
 * Created by Moonchan on 2018. 1. 10..
 */
public class CarFactory {
    private CarFactory() {}

    private static Car createCar() {
        return new Car();
    }

    public static Car createCar(String name) {
        return new Car(name);
    }

    public static Car createAlwaysMoveCar(String name) {
        return new Car(name, () -> true);
    }

    public static Car createNeverMoveCar(String name) {
        return new Car(name, () -> false);
    }
}
