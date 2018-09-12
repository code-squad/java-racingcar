package racingcar;

import java.util.ArrayList;
import java.util.Scanner;

public class InputView {

    private InputView() {
    }  // prevent making InputView object

    public static ArrayList<String> userInput() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> inputValue = new ArrayList<>();

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        inputValue.add(scan.next());
        System.out.println("시도할 회수는 몇 회 인가요?");
        inputValue.add(scan.next());
        System.out.println();

        return inputValue;
    }
}
