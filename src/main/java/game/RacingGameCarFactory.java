package game;

import static java.util.stream.Collectors.toList;

import car.Car;
import java.util.Arrays;
import java.util.List;

public class RacingGameCarFactory {

  public static List<Car> createCars(String input) {
    String[] names = input.split(",");
    return Arrays.stream(names)
        .map(Car::new)
        .collect(toList());
  }
}
