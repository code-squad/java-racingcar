package racingGame;

public class Car {

    private int position;

    private String positionToString;

    public Car() {
        this.position = 0;
        this.positionToString = "";
    }

    public String moveString() {
        this.positionToString += "-";
        return positionToString;
    }

    public void rePosition(int random) {
        int standard = 4;

        if (random >= standard) {
            this.position ++;
            positionToString = moveString();
        }
    }

    public void printCarMove() {
        System.out.println(positionToString);
    }

    public int getPosition() {
        return position;
    }
}
