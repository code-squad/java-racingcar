package racingGame;

import java.util.ArrayList;

public class Game {
    public void start(int time, String text) { //레이싱 시작
        ArrayList<Car> cars = getCars(getCarNames(text)); //게임 시작, 초기화
        playGame(time, cars); //게임 진행중
        Printer.printWinner(getWinnerCars(cars)); //게임 끝, 우승자 출력
    }

    private void playGame(int time, ArrayList<Car> cars) { //게임 진행중
        for(int i=0; i<time; ++i) {
            eachTimeMove(cars); //한 회 차들의 움직임
            Printer.printAll(cars); //현재 상태출력
        }
    }

    private void eachTimeMove(ArrayList<Car> cars) {
        for(Car car : cars) {
            car.move();
        }
    }

    private ArrayList<Car> getCars(String[] carNames) {
        ArrayList<Car> cars = new ArrayList();
        for(int i=0; i<carNames.length; ++i) {
            cars.add(new Car(carNames[i]));
        }
        return cars;
    }

    private String[] getCarNames(String text) {
        return text.split(",");
    }

    ArrayList<Car> getWinnerCars(ArrayList<Car> cars) {
        ArrayList<Car> winnerCars  = new ArrayList();
        winnerCars.add(cars.get(0));
        for(int i=1; i<cars.size(); ++i) {
            addWinnerCar(winnerCars, cars.get(i));
        }
        return winnerCars;
    }

    void addWinnerCar(ArrayList<Car> winnerCars, Car car) {
        Car winnerCar = winnerCars.get(0);
        if(isFasterPosition(winnerCar, car))
            return;
        if(isSamePosition(winnerCar, car)) {
            winnerCars.add(car);
            return;
        }
        winnerCars.clear();
        winnerCars.add(car);
    }

    boolean isFasterPosition(Car winnerCar, Car car) {
        return winnerCar.getPosition() > car.getPosition();
    }

    boolean isSamePosition(Car winnerCar, Car car) {
        return winnerCar.getPosition() == car.getPosition();
    }
}
