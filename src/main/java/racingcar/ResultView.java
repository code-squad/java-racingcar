package racingcar;

import java.util.ArrayList;
import java.util.List;

public class ResultView {


    public static String repeatString(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

    public static void printResult(List<Car> cars) {
        int maxPosition = 0;
        System.out.println("실행결과");
        for (Car car : cars) {
            int nowPosition = car.getPosition();
            System.out.println(car.getName() + " : " + repeatString(nowPosition));
            if (maxPosition < nowPosition) maxPosition = nowPosition;
        }
        printWinner(cars, maxPosition);
    }

    public static List<Car> checkWinner(List<Car> cars, int maxPosition) {
        List<Car> winner = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winner.add(car);
            }
        }
        return winner;
    }

    public static void printWinner(List<Car> cars, int maxPosition) {
        List<Car> winner = checkWinner(cars, maxPosition);
        for (int i = 0; i < winner.size(); i++) {
            System.out.print(winner.get(i).getName());
            if (i < winner.size() - 1) System.out.print(", ");
        }
        System.out.print("가 최종 우승하였습니다.");
    }

}
