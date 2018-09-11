package racingcar;

import java.util.Scanner;
import java.util.Random;

public class RacingGame {
    private static final int BOUNDOFRANDOM = 10;
    private static final int CONDITIONTOADVANCE = 4;
    private static final String MARKOFADVANCE = "-";

    private int[] carPositions;

    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        Scanner scanner = new Scanner(System.in);

        int vehicles = racingGame.getVehicles(scanner);
        int trials = racingGame.getTrials(scanner);

        racingGame.play(vehicles, trials);
    }

    public void play(int vehicles, int trials) {
        setCarpositions(vehicles);
        run(vehicles, trials);
        print(vehicles);
    }

    public int getVehicles(Scanner scanner) {
        System.out.println("자동차 대 수는 몇 대 인가요?");
        int numberOfVehicles = scanner.nextInt();
        return numberOfVehicles;
    }

    public int getTrials(Scanner scanner) {
        System.out.println("시도 할 회수는 몇 회 인가요?");
        int numberOfTrials = scanner.nextInt();
        return numberOfTrials;
    }

    public int[] setCarpositions(int vehicles) {
        carPositions = new int[vehicles];
        return carPositions;
    }

    public void run(int vehicles, int trials) {
        for (int i = 0; i < trials; i++) {
            runByVehicles(vehicles);
        }
    }

    public void runByVehicles(int vehicles) {
        for (int i = 0; i < vehicles; i++) {
            runByCondition(i);
        }
    }

    public void runByCondition(int i) {
        Random random = new Random();
        if (random.nextInt(BOUNDOFRANDOM) >= CONDITIONTOADVANCE) {
            carPositions[i]++;
        }
    }

    public String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

    public void print(int vehicles) {
        System.out.println("실행 결과");
        for (int i = 0; i < vehicles; i++) {
            String result = repeat(MARKOFADVANCE, carPositions[i]);
            System.out.println(result);
        }
    }
}