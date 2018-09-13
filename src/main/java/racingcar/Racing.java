package racingcar;
import java.util.Random;
import java.util.Scanner;

public class Racing {

    private static final int CONDITION = 4;
    private static final String DASH = "-";

    private int time;
    private int[] carPositions;

    public void run() {
        inputData();
        move();
        print();
    }

    private void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        carPositions = new int[scanner.nextInt()];

        System.out.println("시도할 회수는 몇 회 인가요?");
        time = scanner.nextInt();
    }

    private static int movingJudge() {
        Random random = new Random();

        return (random.nextInt(10) - 1);
    }

    private void move() {
        for (int i = 1; i < time + 1; i++) {
            moveCount();
        }
    }

    private void moveCount() {
        for (int i = 0; i < carPositions.length; i++) {
            moveDecide(i);
        }
    }

    private void moveDecide(int i) {
        if (movingJudge() > CONDITION) {
            carPositions[i]++;
        }
    }

    private void print() {
        for (int i = 0; i < carPositions.length; i++) {
            printImagery(carPositions[i]);
            System.out.println();
        }
    }

    private void printImagery(int carPosition) {
        for (int i = 0; i < carPosition; i++) {
            System.out.printf(DASH);
        }
    }
}
