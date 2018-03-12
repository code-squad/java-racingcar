package racingcar;

public class ResultView {

    public static void printDashForEachCar(String carName, int position) {
        System.out.print(carName + " : ");
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
    }

    public static void printWinner(String winner) {
        System.out.println(winner + "가 우승하였습니다.");
    }

}
