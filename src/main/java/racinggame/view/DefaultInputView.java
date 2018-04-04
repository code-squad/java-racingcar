package racinggame.view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DefaultInputView implements InputView {

    private final static String CAR_NAMES_FORMAT = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)";
    private final static String TRY_COUNT_FORMAT = "시도할 회수는 몇회인가요?";
    private final static String SPLITE_FORMAT = ",";

    @Override
    public List<String> initCarNames() {
        printMessage(CAR_NAMES_FORMAT);
        return Arrays.stream(new Scanner(System.in).nextLine().split(SPLITE_FORMAT)).collect(Collectors.toList());
    }

    @Override
    public int initRacingGameTryCount() {
        printMessage(TRY_COUNT_FORMAT);
        return new Scanner(System.in).nextInt();
    }

    private void printMessage(String message) {
        System.out.println(message);
    }
}
