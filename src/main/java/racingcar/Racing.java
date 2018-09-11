package racingcar;

import java.util.Random;
import java.util.Scanner;

public class Racing {
    private int time;
    private int[] carPositions;

    private final int MAXNUMBER = 10;
    private final int STANDARD = 4;

    public void run(){
        inputData();
        moveCar();

        System.out.println("\n실행 결과");
        for(int i = 0; i < carPositions.length; i++) {
            printMove(carPositions[i]);
        }
    };

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        carPositions = new int[scanner.nextInt()];

        System.out.println("시도할 횟수는 몇 회 인가요?");
        time = scanner.nextInt();
    }

    public void moveCar() {
        for (int i = 0; i < carPositions.length; i++) {
            carPositions[i] = moveCarSingle();
        }
    }

    public int moveCarSingle() {
        int move = 0;
        for (int i = 0; i < time; i++) {
            move += moveCount();
        }
        return move;
    }

    public int moveCount() {
        int move = 0;
        Random random = new Random();
        int randomNum = random.nextInt(MAXNUMBER);

        if(randomNum >= STANDARD) {
            move++;
        }
        return move;
    }

    public void printMove(int move) {
        for(int i = 0; i < move; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
