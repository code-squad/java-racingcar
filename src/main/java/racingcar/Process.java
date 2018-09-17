package racingcar;

import java.util.*;

public class Process {

    private static final int BOUND_RANDOM = 10;
    private static final int JUMP = 4;

    public static String[] cars = {};
    public static int[] carPositions = {};
    public static int trials = 0;

    static Scanner sc = new Scanner(System.in);

    Process (){
        InputView i = new InputView();
        cars = i.setCarsName(sc);
        trials = i.getTrials(sc);
        carPositions = new int[cars.length];
        run_numOfTrials();
    }

    public void run_numOfTrials() {
        for (int i = 0; i < trials; i++) {
            this.run_numOfCars();
        }
    }

    public void run_numOfCars() {
        for (int i = 0; i < cars.length; i++) {
            this.run(i);
        }
    }

    public void run(int i) {
        Random random = new Random();
        if (random.nextInt(BOUND_RANDOM) >= JUMP) {
            carPositions[i]++;
        }
    }
}

