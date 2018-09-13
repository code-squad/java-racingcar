package racingcar;

import java.util.Scanner;
import java.util.Random;

public class RacingGame {
    public static Scanner s = new Scanner(System.in);
    int[] carPositions;

    public static void main(String[] args) {
        RacingGame g = new RacingGame();
        g.makeCar();
        g.initCarPos(g.time());
        g.output();
    }

    public void makeCar(){
        System.out.println("자동차 대수는 몇 대 인가요?");
        carPositions = new int[s.nextInt()];
    }

    public int time() {
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int count = s.nextInt();
        return count;
    }
    public void initCarPos(int count){
        for (int i = 0; i < carPositions.length; i++) {
            carPositions[i] = 0;
            moveRanCreate(count, i);
        }
    }
    public void moveRanCreate(int count, int i) {
        Random rnd = new Random();
        for (int j = 0; j < count; j++) {
            run(rnd.nextInt(10), i);
        }
    }

    public void run(int move, int i){
        if (move >= 4)
            carPositions[i] += 1;
    }

    public void output(){
        for (int i = 0; i < carPositions.length; i++) {
            carDist(i);
            finishLine(i);
        }
    }

    public void carDist(int i) {
        for (int j = 0; j < carPositions[i]; j++) {
            System.out.print("-");
        }
    }

    public void finishLine(int i) {
        if(i < carPositions.length -1)
            System.out.println();
    }
}

