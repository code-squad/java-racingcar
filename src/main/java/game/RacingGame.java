package game;

import car.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RacingGame {

  private List<Car> cars;
  private int times;

  public RacingGame(List<Car> cars, int times) {
    this.cars = cars;
    this.times = times;
  }

  public void racing() {
    cars.stream().forEach(car -> {
      IntStream.range(0, times).forEach(i -> car.move());
    });

//    for (Car car : cars) {
//      IntStream.range(0, times).forEach(i -> car.move());
//    }
  }

  public String getWinner() {
    List<String> winners = new ArrayList<>();
    int high = getHighPosition(cars);

    cars.stream()
        .filter(c -> c.getPosition() == high)
        .forEach(c-> winners.add(c.getName()));

//    for (Car car : cars) {
//      if (car.getPosition() == high) {
//        winners.add(car.getName());
//      }
//    }
    return winners.stream().collect(Collectors.joining(","));
  }

  private int getHighPosition(List<Car> cars) {
    Optional<Integer> high = cars.stream().map(c -> c.getPosition()).reduce(Integer::max);
    return high.get();

//    int high = 0;
//    for (Car car : cars) {
//      if (car.getPosition() > high) {
//        high = car.getPosition();
//      }
//    }
//    return high;
  }

  public void printResult() {
    ResultView resultView = new ResultView();
    System.out.println("실행 결과");
    System.out.println(resultView.drawRaceResultView(cars));
    System.out.println(getWinner() + " 가 최종 우승했습니다.");
  }
}