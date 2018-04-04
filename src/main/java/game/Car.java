package game;

import java.util.Objects;

public class Car {

    private Integer position;

    public Car() {
        this.position = 0;
    }

    public Car(int position) {
        this.position = position;
    }

    public Car(Car car) {
        this.position = car.getPosition();
    }

    public void move(int randomValue) {
        if (GameRule.canMove(randomValue)) {
            this.position++;
        }
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
}
