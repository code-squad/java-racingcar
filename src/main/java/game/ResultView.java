package game;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ResultView {
  private List<Result> results;

  public ResultView(String names) {
    String[] carNames = names.split(",");

    BiFunction<String, Integer, Result> con = Result::new;
    results = Arrays.stream(carNames)
        .map(name -> con.apply(name, 0))
        .collect(toList());
  }

  public void setResults(List<Result> results) {
    this.results = results;
  }

  public List<Result> getResults() {
    return results;
  }

  public void printResult() {
    System.out.println("실행 결과");
    System.out.println(drawResultUI());
    System.out.println(getWinner() + " 가 최종 우승했습니다.");
  }

  public String drawResultUI() {
    return results.stream()
        .map(r -> r.drawResultLine())
        .collect(Collectors.joining());
  }

  public String getWinner() {
    int high = getHighPosition();
    return results.stream()
        .filter(r -> r.getPosition() == high)
        .map(c -> c.getName())
        .collect(Collectors.joining(","));

//    List<String> winners = new ArrayList<>();
//    for (Result result : results) {
//      if (result.getPosition() == high) {
//        winners.add(result.getName());
//      }
//    }
//    return winners;
  }

  private int getHighPosition() {
    return results.stream()
        .max(Comparator.comparingInt(Result::getPosition))
        .get().getPosition();

//    Optional<Integer> high = results.stream().map(r -> r.getPosition()).reduce(Integer::max);
//    return high.get();
//
//    int high = 0;
//    for (Result result : results) {
//      if (result.getPosition() > high) {
//        high = result.getPosition();
//      }
//    }
//    return high;
  }
}
