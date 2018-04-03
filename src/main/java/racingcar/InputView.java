package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author sangsik.kim
 */
public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Integer MINIMUM_RUN_COUNT = 0;

    public static List<String> getNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] names = scanner.nextLine().split(",");
        List<String> result = new ArrayList<>();
        for (String name : names) {
            result.add(name.trim());
        }
        return result;
    }

    public static Integer getRunCount() {
        Integer count = MINIMUM_RUN_COUNT;
        while (count <= MINIMUM_RUN_COUNT) {
            System.out.println("시도할 회수는 몇 회 인가요?");
            count = scanner.nextInt();
        }
        return count;
    }
}
