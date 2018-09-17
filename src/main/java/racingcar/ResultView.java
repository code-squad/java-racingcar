package racingcar;

public class ResultView {

    public static void printResult(RacingGame racingGame) {
        displayGame(racingGame.getCars());
        displayWinners(racingGame.winners(racingGame.getCars()));
    }

    public static void displayGame(Car[] cars) {
        System.out.println("실행 결과");
        for (int i = 0; i < cars.length; i++) {
            cars[i].printCarName();
            System.out.print(" : ");
            cars[i].drawDash();
        }
    }

    public static void displayWinners(String[] winners) {
        System.out.print("우승자는 " + String.join(",",winners) + " 입니다.");
    }


}