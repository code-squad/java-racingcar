package racing;

import car.Car;

import java.util.ArrayList;
import java.util.List;

public class GameResult {
    private List<Car> carList;
    private List<String> winnerList;

    public GameResult(List<Car> carList) {
        this.carList = carList;
        this.winnerList = getWinnerList(carList);
    }

    public static List<String> getWinnerList(List<Car> carList) {
        int maxScore = getMaxScore(carList);
        List<String> winnerList = new ArrayList<>();

        for(Car car : carList)
            tryToPutWinner(winnerList, car, maxScore);

        return winnerList;
    }

    public static int getMaxScore(List<Car> carList) {
        int maxScore = -1;
        for(Car car : carList)
            maxScore = Math.max(maxScore, car.getCurrentPosition());

        return maxScore;
    }

    public static void tryToPutWinner(List<String> winnerList, Car car, int maxScore) {
        if(car.getCurrentPosition() == maxScore)
            winnerList.add(car.getName());
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<String> getWinnerList() {
        return winnerList;
    }
}
