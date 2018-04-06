package racingcar.domain;

import racingcar.domain.interfaces.Car;

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
        return new Record(this.name, this.position);
    }

    private Boolean canMove(Integer point) {
        return point >= MOVE_CRITERIA;
    }

    private void forward() {
        this.position++;
    }
}
