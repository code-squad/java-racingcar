package racingcar;

import racingcar.domain.Car;

import java.util.ArrayList;

public class ResultView {
    private static final String OUT_COMMMA = "-";

    public void printGame(ArrayList<Car> cars) {
        printRun(cars);
    }

    public static void printRun(ArrayList<Car> cars) {                  //출력
        System.out.println("출력 결과");
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i).getName() + " : ");
            checkRun(cars.get(i).getMove());
            System.out.println();
        }
        System.out.println();
    }

    public static void checkRun(int getMove) {
        for (int i = 0; i < getMove; i++)
            System.out.print(OUT_COMMMA);
    }

    public void winCheck(ArrayList<Car> cars, int max) {
        ArrayList<String> winner = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            winCheckMax(cars.get(i), max, winner);
        }
        System.out.println(String.join(",", winner) + " 최종 우승자 입니다.");
    }

    private ArrayList<String> winCheckMax(Car car, int max, ArrayList<String> winner) {
        if (max == car.getMove()) {
            winner.add(car.getName());
        }
        return winner;
    }
}

