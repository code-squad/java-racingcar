package game;

import java.util.Objects;

public class Car {

    private Integer position;

    public static Car newInstance() {
        Car car = new Car();
        car.position = 0;
        return car;
    }

    public static Car of(int position) {
        Car car = new Car();
        car.position = position;
        return car;
    }

    public void move() {
        this.position++;
    }

    public Integer getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(position, car.position);
    }

    private Car() {}
}
