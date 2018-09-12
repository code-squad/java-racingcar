package racingcar;


import java.util.Scanner;

public class InputView {

    public static String readFromKeyboard() {
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    public static String[] inputCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = readFromKeyboard();

        return carNames.split(",");
    }

    public static int inputTime() {
        System.out.println("시도할 횟수는 몇회인가요?");
        String inputTime = readFromKeyboard();

        return Integer.parseInt(inputTime);
    }
}
