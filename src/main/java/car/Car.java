package car;

import java.util.Random;

public class Car {
    
    public void move(int tryNumber){
        StringBuilder sb = tryForward(tryNumber, 9);
        print(sb);
    }

    private void print(StringBuilder sb) {
        System.out.println(sb.toString());
    }

    private StringBuilder tryForward(int tryNumber, int range) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<tryNumber;i++) {
            int random = makeRandomNumber(range);
            if (isMovable(random)) {
                sb.append("-");
            }
        }
        return sb;
    }

    private boolean isMovable(int random) {
        return random > 4;
    }

    private int makeRandomNumber(int range) {
        return new Random().nextInt(range);
    }
}
