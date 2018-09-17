package racingcar;

import java.util.List;

public class ResultView {
    //자동차 결과점수(거리) 출력
    public static void printScore(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).getName() + " : " + printDist(cars.get(i).getPosition()));
        }
    }

    //우승자 출력
    public static void printWinner(List<String> winners) {
        for (int i = 1; i < winners.size(); i++) {
            System.out.print(winners.get(i));
        }
        System.out.println("가 최종 우승했습니다.");
    }

    //자동차 이동거리 출력
    public static String printDist(int pos) {
        String dist = "";
        for (int i = 0; i < pos; i++) {
            dist += "-";
        }
        return dist;
    }
}
