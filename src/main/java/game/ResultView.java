package game;

import car.Car;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ResultView {
  public String drawRaceResultView(List<Car> cars) {
    return cars.stream()
        .map(c -> c.getName() + " : " + printBar(c.getPosition(), '-') + "\n")
        .collect(Collectors.joining());
  }

  private String printBar(int count, char character) {
    char[] bar = new char[count];
    IntStream.range(0, count).forEach(i -> bar[i] = character);
//    for (int i = 0; i < count; i++) {
//      bar[i] = character;
//    }
    return new String(bar);
  }
}
