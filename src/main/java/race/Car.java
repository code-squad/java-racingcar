package race;

import java.util.Random;

public class Car {
    private static final int JUMP = 4;
    private String name;
    private int position = 0;

    public  Car(String name,int tryCount) {
        this.name = name;
        go(tryCount);
    }

    public void go(int tryCount) {
        for (int i = 0; i < tryCount; i++) {
            check();
        }
    }

    public void check() {                                                      //차위치 배열값이 시도횟수가 4이상일경우 값을 1증가
        Random rnd = new Random();
        if (rnd.nextInt(10) >= JUMP) {
            position++;
        }
    }

   public int getPosition(){
        return position;
   }

   public String getName() {
        return name;
    }

}
