package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private int position = 0;

    //자동차 객체 리스트 생성
    public static List<Car> createCars(int numOfCars) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < numOfCars; i++) {
            cars.add(new Car());
        }
        return cars;
    }

    //자동차 name 초기화
    public static void initCarName(List<Car> cars,String[] names) {
        InputView input = new InputView();
        for (int i = 0; i < names.length; i++) {
            cars.get(i).name = names[i];
        }
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
