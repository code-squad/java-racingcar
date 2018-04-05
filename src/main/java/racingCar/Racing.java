package racingCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Racing {

    private final int STANDARD_VALUE = 4;
    private final int GO = 1;
    private final int STOP = 0;

    private List<Car> carList = new ArrayList<>();

    private int carNumbers;
    private int time;

    public Racing() {

    }

    public Racing(int carNumbers, int time) {
        this.carNumbers = carNumbers;
        this.time = time;
    }

    /*
    * TODO
    * 1.공백제거
    * 2.main메소드 분리
    * 3.핵심로직과 view 로직 분리 - 힌트 주신 것 들을 조합해서 시도해보았습니다. --> 이런식으로 진행하는게 맞을까요?
    * 4.클래스 구현순서 (상수,인스턴스 변수 , 생성자, 메소드) 정리
    * 5.테스트 값은 경계값으로 변경 --->경계값이란게 정확히 무엇일까요?
    * */

    public List<Car> race() {
        for (int carCount = 0; carCount < this.carNumbers; carCount++) {
            Car car = new Car();
            moveAndStop(car);
            carList.add(car);
        }
        return carList;
    }

    private void moveAndStop(Car car) {
        for (int tryCount = 0; tryCount < this.time; tryCount++) {
            int random = nextMoveAndStop();
    /* * TODO
     * if문제거
     */
            if (random == 1) car.go();
            if (random == 0) car.stop();

        }
    }

    public int makeRandomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public int nextMoveAndStop() {
        return makeRandomNumber() > STANDARD_VALUE ? GO : STOP;
    }
}
