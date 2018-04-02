package racingcar;

import racingcar.interfaces.Car;

/**
 * @author sangsik.kim
 */
public class UserRecord implements Comparable<UserRecord> {
    private String name;
    private Integer record;

    public UserRecord(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("자동차 정보가 올바르지 않습니다.");
        }
        this.name = car.getName();
        this.record = car.getCurrentPosition();
    }

    public String getName() {
        return this.name;
    }

    public Integer getRecord() {
        return this.record;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.record;
    }

    @Override
    public int compareTo(UserRecord o) {
        return Integer.compare(this.record, o.record);
    }
}
