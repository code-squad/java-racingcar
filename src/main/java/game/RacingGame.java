package game;

import car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class RacingGame {
    private List<Car> cars;
    private int tryCount;

    public RacingGame(String carsName, int tryCount) {
        cars = new ArrayList<>();
        this.tryCount = tryCount;
        makeCars(carsName);
    }

    private void makeCars(String carsName) {
        StringTokenizer st = new StringTokenizer(carsName, ",");
        while (st.hasMoreTokens()) {
            cars.add(new Car(st.nextToken()));
        }
    }

    public void moveTry() {
        IntStream.range(0, tryCount).forEach(i -> moveCars());
    }

    private void moveCars() {
        for (Car car : cars) {
            car.moveCar();
        }
    }

    public void resultPrint() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getName());
            sb.append(" : ");
            sb.append(printLine(car));
            sb.append("\n");
        }
        sb.append("\n");
        sb.append(findWinner());
        sb.append("가 최종 우승했습니다.");

        System.out.println(sb.toString());
    }

    public String findWinner() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            winnerCheck(car, sb);
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public int findTopPosition() {
        int max = 0;
        for (Car car : cars) {
            max = maxSwap(max, car.getPosition());
        }
        return max;
    }

    private int maxSwap(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    private void winnerCheck(Car car, StringBuilder sb){
        if(car.getPosition() == findTopPosition()) {
            sb.append(car.getName());
            sb.append(", ");
        }
    }

    private String printLine(Car car) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, car.getPosition()).forEach(i -> sb.append("-"));
        return sb.toString();
    }

    public List<Car> getCars() {
        return cars;
    }
}
