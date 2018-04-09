package racing;



import java.util.*;

import static java.util.stream.Collectors.joining;

public class GameResult {

    public static void showWinners(List<Car> result) {

        Map<String, Integer> temp = new HashMap<>();

        for (Car car : result)
            temp.put(car.getName(), car.getPosition());

        int maxValue = Collections.max(temp.values());

        final String resultName = temp.entrySet()
                .stream()
                .filter(num -> num.getValue() >= maxValue)
                .map(Map.Entry::getKey)
                .collect(joining(", "));

        System.out.println(resultName + "가 최종 우승했습니다.");
    }

}
