package game;

import static java.util.stream.Collectors.toList;

import car.Car;
import java.util.Arrays;
import java.util.List;

public class RacingGameCarFactory {

  public static List<Car> createCars(String input) {
    return createCars(input, ",");
  }

  public static List<Car> createCars(String input, String separator) {
    String[] names = input.split(separator);
    return createCars(names);
  }

  public static List<Car> createCars(String[] names) {
    return Arrays.stream(names)
        .map(Car::new)
        .collect(toList());
  }
}
