package racingcar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputView {

    public static String readFromKeyboard() {
        String input = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return input;
    }

    public static String[] inputCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = readFromKeyboard();
        String[] carNamesArr = carNames.split(",");

        return carNamesArr;
    }

    public static int inputTime() {
        System.out.println("시도할 횟수는 몇회인가요?");
        String inputTime = readFromKeyboard();

        return Integer.parseInt(inputTime);
    }
}
