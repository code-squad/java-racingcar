package racing.car;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class Car {

    private static int BOUND = 4;
    private int position;
    private NumberGenerator numberGenerator;

    public Car() {
        this.numberGenerator = new RandomNumberGenerator();
    }

    public Car(NumberGenerator engine) {
        this.numberGenerator = engine;
    }

    public void move() {
        if (canMoveCar()) {
            this.position++;
        }
    }

    private boolean canMoveCar() {
        return numberGenerator.generateNumber() > BOUND;
    }

    public int getPosition() {
        return position;
    }


}
