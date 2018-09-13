package racingcar;

import java.util.ArrayList;

public class ResultView {

    private ResultView() {
    }  // prevent making ResultView object

    public static void printPos(ArrayList<Car> carList) {
        System.out.println("실행 결과");
        for (Car car : carList) {
            showCarPos(car);
            System.out.println();
        }
        System.out.println();
    }

    public static void showCarPos(Car car) {
        System.out.print(car.getCarName() + " : ");  // print userName
        car.showCarPosition();  // print car position
    }

    public static void printResult(ArrayList<Car> carList) {
        showResult(compareCarPos(carList));
    }

    public static ArrayList<Car> compareCarPos(ArrayList<Car> carList) {

        int maxPos = Racing.POS_CAR_INIT;
        for (Car car : carList) {
            maxPos = car.findMaxPos(car, maxPos);
        }

        return findWhoWin(carList, maxPos);
    }

    public static ArrayList<Car> findWhoWin(ArrayList<Car> carList, int maxPos) {
        ArrayList<Car> resultList = new ArrayList<>();

        for (Car car : carList) {
            if (car.hasSamePos(maxPos)) {
                resultList.add(car);
            }
        }
        return resultList;
    }

    public static void showResult(ArrayList<Car> resultList) {
        for (int i = 0; i < resultList.size() - 1; i++) {
            System.out.print(resultList.get(i).getCarName() + ", ");
        }
        System.out.print(resultList.get(resultList.size() - 1).getCarName());  // last one formatting
        System.out.println("가 최종 우승했습니다.");
    }

}
