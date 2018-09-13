package racingcar;

public class OutputValue extends RacingGame {

    public void outputValue() {
    }

    public static void displayGame(Car[] cars) {
        System.out.println("실행 결과");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].name() + " : " + drawDash(cars[i].position()));
        }
    }
    public static void displayWinners(Car[] cars) {
        System.out.print("우승자는: " + String.join(",",winners(cars)));
    }
}