package racingcar;

import java.util.ArrayList;

public class RacingGame {
    public static final String OUT_COMMMA = "-";
    private ArrayList<Car> cars = new ArrayList<>();

    RacingGame(String carNames){
        carinstuns(carNumverCut(carNames));
    }

    public String[] carNumverCut(String car) { //이름 자르기[입력] 사용 ok
        return car.split(",");
    }

    public void carinstuns(String[] car) {              //객체 생성
        for (int i = 0; i <car.length; i++)
            cars.add(new Car(car[i]));
    }

    public void randomCamparison(int time) {
        for (int i = 0; i < time; i++) {
            comparison();
        }
    }
    public void comparison() {              //랜덤값 반복
        for (int i = 0; i < cars.size(); i++)  //자동차 만큼 돌아간다.
            cars.get(i).moveRandom();            //랜덤을 실행하라.[랜덤값 입력됨]
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
