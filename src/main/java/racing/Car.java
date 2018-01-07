package racing;

import org.apache.commons.lang3.StringUtils;

public class Car {

    private final String name;
    private MoveStrategy strategy;

    public Car(MoveStrategy strategy, String name) {
        checkArguments(strategy, name);

        this.strategy = strategy;
        this.name = name;
    }

    public int move() {
        if (strategy.go() >= 4) {
            return 1;
        }
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public MoveStrategy getStrategy() {
        return strategy;
    }

    private void checkArguments(MoveStrategy strategy, String name) {
        if (strategy == null) {
            throw new IllegalArgumentException("strategy should not be null");
        }
        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException("name should not be empty");
        }
    }

}
