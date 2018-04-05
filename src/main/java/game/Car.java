package game;

import java.util.Objects;

public class Car {

    private Integer position;
    private String name;

    public final static String DEFAULT_NAME = "default car";

    public Car() {
        this.position = 0;
        this.name = DEFAULT_NAME;
    }

    public Car(Integer position, String name) {
        this.position = position;
        this.name = name;
    }

    public Car(Car car) {
        this.position = car.getPosition();
        this.name = car.getName();
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
