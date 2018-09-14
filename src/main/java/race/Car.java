package race;

import java.util.Random;

public class Car {
    private static final int RANDOM = 10;
    private static final int MOVE = 4;
    private static int max = -1;
    private String name;
    private int position=0;

    public  Car(String name) {
        this.name = name;
    }

    public void go() {                                                      //차위치 배열값이 시도횟수가 4이상일경우 값을 1증가
        Random rnd = new Random();
        if (rnd.nextInt(RANDOM) >= MOVE) {
            position++;
        }
    }

   public String getName() {
        return name;
    }

    public int getPosition(){
        return position;
    }

    public int maxPosition() {
        if(max < position)
            max = position;
        return max;
    }

    public void victory() {
        if(max == this.position)
            ResultView.victory(name);
    }
}
