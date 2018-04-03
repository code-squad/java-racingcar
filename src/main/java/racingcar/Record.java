package racingcar;

import racingcar.interfaces.Car;

/**
 * @author sangsik.kim
 */
public class Record implements Comparable<Record> {
    private String name;
    private Integer position;

    public Record(String name, Integer position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPosition() {
        return this.position;
    }

    public Boolean matchPosition(Record record) {
        return this.position.equals(record.getPosition());
    }

    @Override
    public int compareTo(Record record) {
        return Integer.compare(this.position, record.position);
    }
}
