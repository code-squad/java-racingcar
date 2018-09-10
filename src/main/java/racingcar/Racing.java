package racingcar;

import java.util.Random;

public class Racing {
    private int time;
    private int[] carPositions;

    public Racing() {
    }

    public Racing(int time, int carNum) {
        this.time = time;
        this.carPositions = new int[carNum];
        for (int i = 0; i < carNum; i++) {
            this.carPositions[i] = 1;
        }
    }

    public void move() {
        Random random = new Random();
        for(int i=0; i<this.carPositions.length; i++){
            int randNum = random.nextInt(10);
            if (randNum >= 4) this.carPositions[i]++;
        }

    }

    public void run() {
        for (int i = 0; i < this.time; i++) {
            move();
        }
        printStatus(this.carPositions);
    }

    public String repeatString(int n){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<n; i++){
            sb.append("-");
        }
        return sb.toString();
    }


    public void printStatus(int[] carPositions) {
        System.out.println("실행결과");
        for (int i : carPositions) {
            System.out.println(repeatString(i));
        }
    }

}
