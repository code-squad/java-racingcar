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
        ArrayList<Car> resultList = new ArrayList<>();

        for (Car car : carList) {
            resultList = compareCarPos(car, resultList);
        }
        showResult(resultList);
    }

    public static ArrayList<Car> compareCarPos(Car car, ArrayList<Car> resultList) {
        if (resultList.size() == 0 || resultList.get(0).areMoreFarThan(car) == 0) {
            resultList.add(car);
        } else if (resultList.get(0).areMoreFarThan(car) == -1) {
            resultList.clear();
            resultList.add(car);
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
