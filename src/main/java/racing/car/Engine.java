package racing.car;

/**
 * Created by Moonchan on 2018. 1. 8..
 */
public class Engine {
    private int bound;
    private NumberGenerator numberGenerator;

    public Engine(int bound, NumberGenerator numberGenerator) {
        this.bound = bound;
        this.numberGenerator = numberGenerator;
    }

    public boolean move() {
        return numberGenerator.generateNumber() > bound;
    }
}
