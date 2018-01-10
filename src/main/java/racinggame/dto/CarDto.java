package racinggame.dto;

import java.util.Objects;
import java.util.stream.IntStream;

public class CarDto {
    private static final String STATUS_BAR = "-";

    private String name;
    private int position;

    public CarDto(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public boolean isMaxPosition(int maxPosition) {
        return maxPosition == this.position;
    }

    public String createStatus() {
        StringBuilder status = new StringBuilder();
        IntStream.range(0, position).forEach(i -> {
            status.append(STATUS_BAR);
        });
        return status.toString();
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
        return Objects.hash(name, position);
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
