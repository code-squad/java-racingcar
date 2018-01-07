package game;

import static java.util.stream.Collectors.toList;

import car.Car;
import car.MoveCondition;
import car.RandomMoveCondition;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class RacingGameCarFactory {

  public static List<Car> createCars(String input) {
    String[] names = input.split(",");
    return Arrays.stream(names)
        .map(Car::new)
        .collect(toList());
  }

  public static List<Car> createRandomMoveConditionCars(String input) {
    BiFunction<String, MoveCondition, Car> randomMoveConditionCar = Car::new;

    String[] names = input.split(",");
    return Arrays.stream(names)
        .map(n -> randomMoveConditionCar.apply(n, new RandomMoveCondition()))
        .collect(toList());
  }
}
