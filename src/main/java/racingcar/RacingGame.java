package racingcar;

import java.util.Random;

public class RacingGame {

    private int[] carPositions;
    Random random = new Random();

    public RacingGame(int carCnt) {
        carPositions = new int[carCnt];
    }

    int[] move() {
        for(int i = 0; i < carPositions.length; i++){
            carPositions[i] = addPosition(carPositions[i]);
        }

        return carPositions;
    }

    int addPosition(int currentPosition){
        if(getRandomValue() >= 4)
            return ++currentPosition;

        return currentPosition;
    }

    int getRandomValue(){
        return random.nextInt(10);
    }

}
