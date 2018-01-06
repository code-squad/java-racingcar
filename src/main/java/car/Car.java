package car;

import java.util.Random;

public class Car {
    private static int RANGE = 9;
    private int position;

    public void move(int tryNumber){
        this.position = tryForward(tryNumber, RANGE);
        print(this.position);
    }

    private void print(int position) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<position; i++){
              sb.append("-");
        }
        System.out.println(sb.toString());
    }

    public int tryForward(int tryNumber, int range) {
        int position = 0;
        for(int i=0;i<tryNumber;i++) {
            int random = makeRandomNumber(range);
            if (isMovable(random)) {
                position ++;
            }
        }
        return position;
    }

    private boolean isMovable(int random) {
        return random > 4;
    }

    private int makeRandomNumber(int range) {
        return new Random().nextInt(range);
    }
}
