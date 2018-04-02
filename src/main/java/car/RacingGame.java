package car;

import java.util.Random;

public class RacingGame {
    Random random = new Random();

    public void move(int time, int numberOfCars) { //레이싱 진행

        int[] carPositions = new int[numberOfCars]; //현재 주행상태

        while (time > 0) { //시도 횟수만큼 주행
            tryAllCar(numberOfCars, carPositions);
            time--;
        }
    }

    public void tryAllCar(int numberOfCars, int[] carPositions) { //모든 차 전진시도
        for(int k=0; k<numberOfCars; ++k) {
            tryOngoing(carPositions, k, makeRandomNumber());
            printCar(carPositions[k]);
        }
        System.out.println("");
    }

    public void printCar(int carPosition) { //한대의 차 현재 위치 출력
        for(int l = 0; l< carPosition; ++l) {
            System.out.print("-");
        }
        System.out.println("");
    }

    public void tryOngoing(int[] carPositions, int k, int randomNumber) { //랜덤숫자에 따라 전진
        if (randomNumber > 3) {
            carPositions[k]++;
        }
    }

    private int makeRandomNumber() { //랜덤숫자생성 0~9
        return random.nextInt(10);
    }
}
