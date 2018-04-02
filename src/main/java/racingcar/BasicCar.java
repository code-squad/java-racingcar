package racingcar;

import racingcar.interfaces.Car;

/**
 * @author sangsik.kim
 */
public class BasicCar implements Car {
    private final static Integer MOVE_CRITERIA = 4;
    private final static Integer INITIAL_POSITION = 0;
    private Integer position;
    private String name;

    public BasicCar(String name) {
        this.name = name;
        this.position = INITIAL_POSITION;
    }

    @Override
    public Record move(Integer point) {
        if (canMove(point)) {
            forward();
        }
        return new Record(this);
    }

    @Override
    public Integer getPosition() {
        return this.position;
    }

    @Override
    public String getName() {
        return this.name;
    }

    private Boolean canMove(Integer point) {
        return point >= MOVE_CRITERIA;
    }

    private void forward() {
        this.position++;
    }
}
