package racingcar;

import java.util.ArrayList;

public class ResultView {
    public static final String DASH = "-";

    private ResultView() {
    }  // prevent making ResultView object

    public static void printPos(ArrayList<Car> cars) {
        System.out.println("실행 결과");
        for (Car car : cars) {
            showCarPos(car);
            System.out.println();
        }
        System.out.println();
    }

    public static void showCarPos(Car car) {
        System.out.print(car.getCarName() + " : ");  // print userName
        int pos = Racing.POS_CAR_INIT - 1;
        while (!car.hasSamePos(pos)) {
            System.out.print(DASH);  // print userPosition
            pos++;
        }
    }

    public static void printResult(ArrayList<Car> cars) {
        showResult(compareCarPos(cars));
    }

    public static ArrayList<Car> compareCarPos(ArrayList<Car> cars) {

        int maxPos = Racing.POS_CAR_INIT;
        for (Car car : cars) {
            maxPos = car.findMaxPos(maxPos);
        }

        return findWhoWin(cars, maxPos);
    }

    public static ArrayList<Car> findWhoWin(ArrayList<Car> cars, int maxPos) {
        ArrayList<Car> winners = new ArrayList<>();

        for (Car car : cars) {
            if (car.hasSamePos(maxPos)) {
                winners.add(car);
            }
        }
        return winners;
    }

    public static void showResult(ArrayList<Car> winners) {
        for (int i = 0; i < winners.size() - 1; i++) {
            System.out.print(winners.get(i).getCarName() + ", ");
        }
        System.out.print(winners.get(winners.size() - 1).getCarName());  // last one formatting
        System.out.println("가 최종 우승했습니다.");
    }

}
