package racing;

import java.util.Scanner;

public class InputView {
    GameConfiguration requestToInput() {
        int carCount = requestToInputCount("자동차 대수는 몇 대 인가요?");
        int tryCount = requestToInputCount("시도할 횟수는 몇 회 인가요?");

        return new GameConfiguration(carCount, tryCount);
    }

    private int requestToInputCount(String message) {
        System.out.println(message);

        Scanner scan = new Scanner(System.in);

        return scan.nextInt();
    }
}
