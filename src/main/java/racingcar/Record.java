package racingcar;

import racingcar.interfaces.Car;

/**
 * @author sangsik.kim
 */
public class Record implements Comparable<Record> {
    private String name;
    private Integer position;

    public Record(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("자동차 정보가 올바르지 않습니다.");
        }
        this.name = car.getName();
        this.position = car.getPosition();
    }

    public String getName() {
        return this.name;
    }

    public Integer getPosition() {
        return this.position;
    }

    public boolean is(String name) {
        return this.name.equals(name);
    }

    @Override
    public int compareTo(Record o) {
        return Integer.compare(this.position, o.position);
    }
}
