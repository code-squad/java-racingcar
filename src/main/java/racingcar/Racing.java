package racingcar;
import java.util.Random;
import java.util.Scanner;

public class Racing {

    private int time;
    private int[] carPositions;

    private final int CONDITION = 4;

    void run() {
        inputData();
        move();
        print();
    }

    void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        int numOfCar = scanner.nextInt();
        carPositions = new int[numOfCar];

        System.out.println("시도할 회수는 몇 회 인가요?");
        time = scanner.nextInt();
    }

    int movingJudge() {
        Random random = new Random();
        int preCondition = (random.nextInt(10) - 1);

        return preCondition;
    }

    void move() {
        for (int i = 1; i < time + 1; i++) {
            for (int j = 0; j < carPositions.length; j++) {
                if (movingJudge() > CONDITION) {
                    carPositions[j]++;
                }
            }
        }
    }

    void print() {
        for (int i = 0; i < carPositions.length; i++) {
            for (int j = 0; j < carPositions[i]; j++) {
                System.out.printf("-");
            }
            System.out.println("");
        }
    }
}
