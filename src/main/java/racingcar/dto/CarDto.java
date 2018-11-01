package racingcar.dto;

import java.util.Objects;

public class CarDto {
    private int position;
    private String name;

    private CarDto(String name, int position) {
        this.position = position;
        this.name = name;
    }

    public static CarDto ofNameAndPosition(String name, int position) {
        return new CarDto(name, position);
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDto carDto = (CarDto) o;
        return position == carDto.position &&
                Objects.equals(name, carDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, name);
    }

    @Override
    public String toString() {
        return "<CarDto클래스 속성 : " +
                "name='" + name + '\'' +
                ", position=" + position +
                ">";
    }
}
