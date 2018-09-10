package racingcar;

import java.util.Random;

public class Racing {
    private int time;
    private int[] carPositions;

    public Racing(){}

    public Racing(int time, int carNum){
        this.time = time;
        this.carPositions = new int[carNum];
        for(int i=0; i<carNum; i++){
            this.carPositions[i] = 1;
        }
    }

    public void move(int idx){
        Random random = new Random();
        int randNum = random.nextInt(10);
        if (randNum >= 4){
            this.carPositions[idx]++;
        }

    }

    public void run() {
        for(int i=0; i<this.time; i++){
            for(int j=0; j<this.carPositions.length; j++){
                move(j);
            }
        }

        printStatus(this.carPositions);
    }

    public void printStatus(int[] carPositions){
        System.out.println("실행결과");
        for(int i : carPositions){
            for(int j=0; j<i; j++){
                System.out.print("-");
            }
            System.out.println();
        }

    }

}
