package game;

import static java.util.stream.Collectors.toList;

import car.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {

  private int times;
  private List<Car> cars;

  public RacingGame(int size, int times) {
    cars = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
      cars.add(new Car());
    }
    this.times = times;
  }

  public void move() {
    for (Car car : cars) {
      for (int i = 0; i < times; i++) {
        car.move(generateRandomIntValue());
      }
    }
  }

  public static int generateRandomIntValue() {
    return new Random().nextInt(10);
  }

  public void print() {
    System.out.println(
        ResultView.drawView(
          cars.stream()
            .map(c -> c.getPosition())
            .collect(toList())
        )
    );
  }
}