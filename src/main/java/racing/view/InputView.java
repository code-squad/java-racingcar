package racing.view;

import racing.model.GameConfiguration;

import java.util.Scanner;

public class InputView {
    public GameConfiguration requestToInput() {
        String[] carNames = requestToInputNames("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        int tryCount = requestToInputCount("시도할 횟수는 몇 회 인가요?");

        return new GameConfiguration(carNames, tryCount);
    }

    private String[] requestToInputNames(String message) {
        System.out.println(message);

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        return input.split(",");
    }

    private int requestToInputCount(String message) {
        System.out.println(message);

        Scanner scan = new Scanner(System.in);

        return scan.nextInt();
    }
}
