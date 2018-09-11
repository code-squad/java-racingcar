package racingcar;

import java.util.ArrayList;

public class ResultView {
    private ArrayList<Car> carList = Racing.carList;
    private ArrayList<Car> resultList = Racing.resultList;

    public void print() {
        System.out.println("실행 결과");
        for (int i = 0; i < carList.size(); i++) {
            compareCarPos(i);
            showCarPos(i);
            System.out.println();
        }
        System.out.println();
        showResult();
    }

    public void showCarPos(int i) {
        System.out.print(carList.get(i).getCarName() + " : ");  // print userName
        for (int j = 0; j < carList.get(i).getCarPosition(); j++) {
            System.out.print("-");  // print userPosition
        }
    }

    public void compareCarPos(int i) {
        if (resultList.size() == 0 || resultList.get(0).getCarPosition() == carList.get(i).getCarPosition()) {
            resultList.add(carList.get(i));
        } else if (resultList.get(0).getCarPosition() < carList.get(i).getCarPosition()) {
            resultList.clear();
            resultList.add(carList.get(i));
        }
    }

    public void showResult() {
        for (int i = 0; i < resultList.size() - 1; i++) {
            System.out.print(resultList.get(i).getCarName() + ", ");
        }
        System.out.print(resultList.get(resultList.size() - 1).getCarName());  // last one formatting
        System.out.println("가 최종 우승했습니다.");
    }

}
