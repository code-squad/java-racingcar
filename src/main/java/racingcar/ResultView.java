package racingcar;

import java.util.ArrayList;

public class ResultView {
    public static final String POS_CHAR = "-";

    private ResultView() {
    }  // prevent making ResultView object

    public static void print() {
        ArrayList<Car> carList = Racing.getCarList();
        ArrayList<Car> resultList = new ArrayList<>();

        System.out.println("실행 결과");
        for (Car car : carList) {
            showCarPos(car);
            System.out.println();
            resultList = compareCarPos(car, resultList);
        }
        System.out.println();
        showResult(resultList);
    }

    public static void showCarPos(Car car) {
        System.out.print(car.getCarName() + " : ");  // print userName
        for (int j = 0; j < car.getCarPosition(); j++) {
            System.out.print(POS_CHAR);  // print userPosition
        }
    }

    public static ArrayList<Car> compareCarPos(Car car, ArrayList<Car> resultList) {
        if (resultList.size() == 0 || resultList.get(0).getCarPosition() == car.getCarPosition()) {
            resultList.add(car);
        } else if (resultList.get(0).getCarPosition() < car.getCarPosition()) {
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
