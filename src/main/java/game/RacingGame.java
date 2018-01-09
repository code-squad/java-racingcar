package game;

import static java.util.stream.Collectors.toList;

import car.Car;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class RacingGame {

  private List<Car> cars;
  private int times;

  public RacingGame(List<Car> cars, int times) {
    this.cars = cars;
    this.times = times;
  }

  public List<Result> racing(RacingGameRuleGenerator generator) {
    BiFunction<String, Integer, Result> con = Result::new;
    return cars.stream()
        .map(car -> {
          IntStream.range(0, times).forEach(i -> car.move(generator.getGenerateValue()));
          return con.apply(car.getName(), car.getPosition());
        })
        .collect(toList());
  }
}