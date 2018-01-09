package racingGame;

public class Car {
    private static final int STANDARD_POINT = 4;
    private static final String MARK = "-";
    private int position;

    public Car() {
        this.position = 0;
    }

    public Car(int position) {
        this.position = 1;
    }

    public void rePosition(int random) {

        if (random >= STANDARD_POINT) {
            this.position ++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String resultString() {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<position; i++) {
            result.append(MARK);
        }
        return String.valueOf(result);

    }
}
