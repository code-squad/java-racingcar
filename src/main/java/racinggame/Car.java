package racinggame;

public class Car {
    private static final int FORWARD_NUM = 4;

    private int position = 0;

    public int move(int number) {
        if (number >= FORWARD_NUM) {
            position++;
        }
        return position;
    }

    public int getPosition() {
        return position;
    }

    String getResult(int position) {
        String result = "";
        while (position > 0) {
            result += "-";
            position--;
        }
        return result;
    }

    public void printResult() {
        System.out.println(getResult(getPosition()));
    }
}
