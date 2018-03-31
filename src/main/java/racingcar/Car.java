package racingcar;

/**
 * @author sangsik.kim
 */
public class Car {
    Integer position;
    MoveScore moveScore;

    public Car() {
        this.position = 0;
        this.moveScore = new MoveScore();
    }

    public void move() {
        if (moveScore.canMove()) {
            moveForward();
        }
    }

    public Integer getCurrentPosition() {
        return this.position;
    }

    private void moveForward() {
        this.position++;
    }
}
