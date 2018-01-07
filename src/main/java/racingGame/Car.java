package racingGame;

public class Car {
    private int position;

    public Car() {
        this.position = 0;
    }

    public void rePosition(int random) {
        int standard = 4;

        if (random >= standard) {
            this.position ++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String resultString() {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<position; i++) {
            result.append("-");
        }
        return result.toString();
    }
}
