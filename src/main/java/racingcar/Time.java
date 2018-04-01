package racingcar;

/**
 * @author sangsik.kim
 */
public class Time {
    private static final Integer TIME_LEFT = 0;
    private Integer time;
    private Integer count;

    public Time(Integer time) {
        this.time = time;
        this.count = TIME_LEFT;
    }

    public void spend() {
        if (this.time > TIME_LEFT) {
            this.time--;
            this.count++;
        }
    }

    public Boolean hasLeft() {
        return this.time > TIME_LEFT;
    }

    public Integer count() {
        return this.count;
    }
}
