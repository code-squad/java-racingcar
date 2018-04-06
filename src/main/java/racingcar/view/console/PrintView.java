package racingcar.view.console;

import racingcar.domain.GameResult;
import racingcar.view.utils.StringHelper;

/**
 * @author sangsik.kim
 */
public class PrintView {

    public static void printProgress(GameResult gameResult) {
        StringHelper.createProgressString(gameResult.getRecords()).forEach(s -> System.out.println(s));
    }

    public static void printWinners(GameResult gameResult) {
        System.out.println(StringHelper.createWinnersString(gameResult.getWinners()) + " 가 최종 우승했습니다.");
    }
}
