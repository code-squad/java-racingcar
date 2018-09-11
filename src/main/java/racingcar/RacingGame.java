package racingcar;

import java.util.Scanner;
import java.util.Random;

public class RacingGame {
    private static final int Condition = 4;
    private static final int Bound = 10;

    private int[] carPositions;

    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int vehicles = racingGame.getVehicles(scanner);
        int trials = racingGame.getTrials(scanner);

        racingGame.play(racingGame, random, vehicles, trials);
    }

    public void play(RacingGame racingGame, Random random, int vehicles, int trials) {
        racingGame.setCarpositions(vehicles);
        racingGame.run(random, vehicles, trials);
        racingGame.print(vehicles);
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

    public void run(Random random, int vehicles, int trials) {
        for (int i = 0; i < trials; i++) {
            runByVehicles(random, vehicles);
        }
    }

    public void runByVehicles(Random random, int vehicles) {
        for (int i = 0; i < vehicles; i++) {
            runByCondition(random, i);
        }
    }

    public void runByCondition(Random random, int i) {
        if (random.nextInt(Bound) >= Condition) {
            carPositions[i]++;
        }
    }

    public String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

    public void print(int vehicles) {
        System.out.println("실행 결과");
        for (int i = 0; i < vehicles; i++) {
            String result = repeat("-", carPositions[i]);
            System.out.println(result);
        }
    }
}