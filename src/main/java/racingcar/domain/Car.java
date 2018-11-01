package racingcar.domain;

import racingcar.dto.CarDto;
import java.util.Objects;

public class Car {
    private static final int FORWARD_NUM = 4;
    private String name;
    private int position = 0;

    private Car(String name) {
        this.name = name;
    }

    public static Car ofName(String name){
        return new Car(name);
    }

    void movePosition(int num){
        if (num >= FORWARD_NUM) this.position++;
    }

    public CarDto CarDto() {
        return CarDto.ofNameAndPosition(name, position);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    @Override
    public String toString() {
        return "<Car클래스 속성 : " +
                "name='" + name + '\'' +
                ", position=" + position +
                ">";
    }
}
