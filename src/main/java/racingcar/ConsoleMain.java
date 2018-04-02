package racingcar;

import java.util.*;

/**
 * @author sangsik.kim
 */
public class ConsoleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RacingGame racingGame = new RacingGame(getParticipantsName(scanner));
        racingGame.start(getTryCount(scanner));

        displayGameResult(racingGame.getGameRecord());
    }

    private static List<String> getParticipantsName(Scanner scanner) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String names = scanner.nextLine();
        return Arrays.asList(names.split(","));
    }

    private static Integer getTryCount(Scanner scanner) {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }

    private static void displayGameResult(GameRecord gameRecord) {
        System.out.println("### 실행결과 ###\n");
        printRecords(gameRecord.loadAll());
    }

    private static void printRecords(Map<Integer, List<UserRecord>> allRoundRecords) {
        for (Integer round : allRoundRecords.keySet()) {
            System.out.println("[ " + round + "회차 ]");
            printRecord(allRoundRecords.get(round));
            System.out.println();
        }
    }

    private static void printRecord(List<UserRecord> records) {
        for (UserRecord userRecord : records) {
            System.out.println(userRecord.getName() + "\t: " + convertNumberToHyphen(userRecord.getRecord()));
        }
    }

    private static String convertNumberToHyphen(Integer position) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < position; i++) {
            result.append("-");
        }
        return result.toString();
    }
}
