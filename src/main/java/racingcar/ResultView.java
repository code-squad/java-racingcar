package racingcar;

import java.util.List;

public class ResultView {
    RacingCar rc = new RacingCar();

    //결과 화면 출력
    public void printResult(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).getName() + " : " + printDist(cars.get(i).getPosition()));
        }
        System.out.print("\n" + rc.winner + "가 최종 우승했습니다.");
    }

    //자동차 이동거리 출력
    public String printDist(int pos) {
        String dist = "";
        for (int i = 0; i < pos; i++) {
            dist += "-";
        }
        return dist;
    }
}
