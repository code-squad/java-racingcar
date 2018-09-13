package racingcar;

import java.util.*;

public class Car{
    private String name;
    private int position = 0;
    private static ArrayList<String> winners = new ArrayList();

    public Car(String name) {
        this.name = name;
    }
    public int position(int i) {
        this.position = i;
        return this.position;
    }
    public String name() {
        String name = this.name;
        return name;
    }

    public static String[] winnerCar(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            compareCar(cars[i], findMax(cars));
        }
        return winners.toArray(new String[winners.size()]);
    }
    // 자동차 포지션값이랑 맥스값이랑 같은지 확인
    public static void compareCar(Car car, int max) {
        if (car.position == max) {
            winners.add(car.name);
        }
    }

    public static int findMax(Car[] car) {
        int max = car[0].position;
        String winnerCar =  car[0].name;
        for (int i = 0; i < car.length; i++) {
            max = findMaxPosition(max, car[i]);
        }
        return max;
    }
    public static int findMaxPosition(int max, Car car) {
        if(car.position > max) {
            return car.position;
        }
        return max;
    }

    /*public void carInfo() {
        System.out.println("차이름: " + name + " 위치: " + position);
    }*/
}