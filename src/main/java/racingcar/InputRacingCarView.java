package racingcar;

import java.util.Scanner;

public class InputRacingCarView {

    public static int inputCarNumber() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return checkInputValue(inputValue());
    }

    public static int inputCarMove() {
        System.out.println("시도할 회수는 몇 회 인가요");
        return checkInputValue(inputValue());
    }

    public static int checkInputValue(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException();
        }
        return value;
    }

    private static int inputValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}