package race;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String RACER_NAME_DELIMITER = ",";
        
        Scanner scanner = new Scanner(System.in, "UTF-8");
        GameView view = new GameView();

        view.askRacerName();
        String name = scanner.nextLine();
        String[] names = name.split(RACER_NAME_DELIMITER);

        view.askNumberOfLab();
        int labs = scanner.nextInt();

        RacingGame game = new RacingGame(names, labs);
        game.race(new DefaultRaceRule());

        Drawer lineDrawer = new LineDrawer();
        lineDrawer.draw(game.getParticipants(), labs);

        GameResult result = new GameResult(game.getParticipants());
        view.announceWinner(result.getWinnerNames());
    }


    private static class GameView {
        private static final String RACER_NAME_ASK_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
        private static final String LABS_ASK_MESSAGE = "시도할 회수는 몇 회 인가요?";
        private static final String WINNER_ANNOUNCE_FORMAT = "%s가(이) 최종 우승했습니다.";

        void askRacerName() {
            System.out.println(RACER_NAME_ASK_MESSAGE);
        }

        void askNumberOfLab() {
            System.out.println(LABS_ASK_MESSAGE);
        }

        void announceWinner(List<String> winners) {
            String winnersName = String.join(", ", winners);
            System.out.println(String.format(WINNER_ANNOUNCE_FORMAT, winnersName));
        }
    }
}
