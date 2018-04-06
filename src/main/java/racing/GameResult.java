package racing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.joining;

public class GameResult {

    HashMap<String, Integer> result;

    public GameResult(HashMap<String, Integer> result) {
        this.result = result;
    }

    public void showWinners() {
        int maxValue = Collections.max(result.values());

        final String resultName = result.entrySet()
                .stream()
                .filter(num -> num.getValue() >= maxValue)
                .map(Map.Entry::getKey)
                .collect(joining(", "));


        System.out.println(resultName + "가 최종 우승했습니다.");

    }


}
