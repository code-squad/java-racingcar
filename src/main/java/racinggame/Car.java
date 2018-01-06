package racinggame;

public class Car {
    private int position = 0;

    private static final int FORWARD_NUM = 4;

    public int move() {
        int number = (int) (Math.random()*10) +1;
        if (number >= FORWARD_NUM) {
            position++;
        }
        return position;
    }

    public int getPosition() {
        return position;
    }

    public String print() {
        String result = "";
        while (position > 0) {
            result += "-";
            position--;
        }
        return result;
    }


}
