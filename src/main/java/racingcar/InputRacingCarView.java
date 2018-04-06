package racingcar;

import java.util.Scanner;

public class InputRacingCarView {

    public static String[] inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.)");
        return separateCarName(checkInputCarNamesValue(inputCarNamesValue()));
    }

    public static String[] separateCarName(String carNames) {
        return removeCarNameTrim(carNames.split(","));
    }

    public static String[] removeCarNameTrim(String[] carNames) {
        for (int i = 0; i < carNames.length; i++) {
            carNames[i] = carNames[i].trim();
        }
        return carNames;
    }

    public static int inputCarMove() {
        System.out.println("시도할 회수는 몇 회 인가요");
        return checkInputMoveValue(inputMoveValue());
    }

    public static String inputCarNamesValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String checkInputCarNamesValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException();
        }
        return value;
    }

    public static int checkInputMoveValue(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException();
        }
        return value;
    }

    private static int inputMoveValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}