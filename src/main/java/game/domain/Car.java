package game.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

public class Car {

    public final static String DEFAULT_NAME = "default car";

    private Integer position;
    private String name;

    public Car(Integer position) {
        this.position = position;
        this.name = DEFAULT_NAME;
    }

    public Car(Integer position, String name) {
        this.position = position;
        this.name = name;
    }

    public static List<Car> of(String[] names) {
        return Arrays.stream(names)
                    .map(name -> new Car(GameRule.START_POSITION, name))
                    .collect(toList());
    }

    public void move(int randomValue) {
        if (GameRule.canMove(randomValue)) {
            this.position++;
        }
    }

    public Integer getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(position, car.position) &&
                Objects.equals(name, car.name);
    }
}
