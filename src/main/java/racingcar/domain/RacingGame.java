package racingcar.domain;

import java.util.ArrayList;
import java.util.Random;

public class RacingGame {
    ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> play(String name, int tryNum) {
        String[] input = carNumverCut(name);
        carInstuns(input);
        move();
        randomCamparison(tryNum);
        return cars;
    }

    public String[] carNumverCut(String car) { //이름 자르기[입력] 사용 ok
        return car.split(",");
    }

    public ArrayList<Car> carInstuns(String[] car) {              //객체 생성
        for (int i = 0; i < car.length; i++)
            cars.add(new Car(car[i]));
        return cars;
    }

    public void move() {
        Random r = new Random();
        int randomInput = 0;
        for (int i = 0; i < cars.size(); i++) {
            randomInput = r.nextInt(9) + 1;
            moveRandom(randomInput, i);
        }
    }

    private void moveRandom(int randomInput, int i) {
        if (randomInput > 4) {
            cars.get(i).setMove(1);
        }
    }

    public void randomCamparison(int tryNum) {
        for (int i = 1; i < tryNum; i++) {
            move();
        }
    }

    public int winnerComparison(ArrayList<Car> cars) {                     //최종값 출력
        int num = 0;
        for (int i = 0; i < cars.size(); i++) {
            num = getNum(cars, num, i);
        }
        return num;
    }

    private int getNum(ArrayList<Car> cars, int num, int i) {
        if (num < cars.get(i).getMove()) {
            num = cars.get(i).getMove();
        }
        return num;
    }
}