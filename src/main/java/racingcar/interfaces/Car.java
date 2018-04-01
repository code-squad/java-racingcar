package racingcar.interfaces;

/**
 * @author sangsik.kim
 */
public interface Car {
    void initialize();

    void move(MoveScoreMaker moveScoreMaker);

    Integer getCurrentPosition();
}
