package racingcar;

import java.util.*;

public class RacingCar {
    List<Car> cars = new ArrayList<>();

    //자동차 객체 리스트 생성 및 name 초기화
    public void makeCar(String[] names) {
        for (int i = 0; i < names.length; i++) {
            cars.add(new Car(names[i]));
        }
    }

    //자동차 움직이기
    public void run(int tryNum) {
        for (int i = 0; i < this.cars.size(); i++) {
            this.cars.get(i).moveCar(tryNum,0);
        }
    }

    //우승자 찾기
    public List<String> findWinners() {
        List<String> winners = new ArrayList<>();
        for (int i = 0; i < this.cars.size(); i++) {
            findOneWinner(i, winners);
        }
        return winners;
    }

    //우승조건 찾기
    public void findOneWinner(int i, List<String> winners) {
        if (cars.get(i).checkMax(findMaxCarDist())) {
            winners.add(", ");
            winners.add(cars.get(i).getName());
        }
    }

    //경주한 자동차 중 최대 거리값 찾기
    public int findMaxCarDist() {
        List<Integer> countDist = new ArrayList<>();
        for (int i = 0; i < this.cars.size(); i++) {
            countDist.add(this.cars.get(i).getPosition());
        }
        return Collections.max(countDist);
    }

    public List<Car> getCars(){
        return cars;
    }
}