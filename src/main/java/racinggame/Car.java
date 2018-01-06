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

    public void printPosition() {
        String result = "";
        while (position > 0) {
            result += "-";
            position--;
        }
        System.out.println(result);
    }
}
