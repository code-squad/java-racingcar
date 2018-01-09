/**
 * Created by hoon on 2018. 1. 6..
 */
public class Car {

    private static final Integer LIMIT_NUMBER = 4;
    private Integer position = 0;

    public Integer move(Integer randomNumber) {
        if(shouldMove(randomNumber)) {
            this.position++;
        }
        return this.position;
    }

    public int getPosition() {
        return position;
    }

    private boolean shouldMove(Integer num) {
        return num >= LIMIT_NUMBER;
    }
}
