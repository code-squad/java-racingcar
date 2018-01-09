/**
 * Created by hoon on 2018. 1. 6..
 */
public class Car {

    private final Integer LIMIT_NUMBER = 4;
    private Integer position = 0;

    public Integer move() {
        if(shouldMove(Utils.getRandomNumber())) {
            this.position++;
        }
        return this.position;
    }

    public Integer getPosition() {
        return position;
    }

    public boolean shouldMove(Integer num) {
        return num >= LIMIT_NUMBER;
    }
}
