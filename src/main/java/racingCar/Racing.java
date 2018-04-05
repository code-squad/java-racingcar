package racingCar;

import java.util.*;

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
    * TODO Step2
        각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
        자동차 이름은 쉼표(,)를 기준으로 구분한다.
        자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다
    * */

    public List<Car> race(List names) {
        for (int carCount = 0; carCount < this.carNumbers; carCount++) {
            Car car = new Car(setCarName(names, carCount));
            moveAndStop(car);
            carList.add(car);
        }
        return carList;
    }

    private String setCarName(List names, int carCount) {
        return names.get(carCount).toString();
    }

    private void moveAndStop(Car car) {
        for (int tryCount = 0; tryCount < this.time; tryCount++) {
             switch (nextMoveAndStop()){
                case 1:
                    car.go();
                    break;
                case 0:
                    car.stop();
                    break;
            }
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
