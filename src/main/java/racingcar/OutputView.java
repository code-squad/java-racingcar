package racingcar;

import java.util.List;

public class OutputView {

    public static void printRacingResult(List<Car> cars) {
        for(int i = 0; i < cars.size(); i++) {
            System.out.print(postionToString(cars.get(i).getPosition(),
                    new StringBuilder().append(cars.get(i).getCarName()).append(" : ")));
        }
    }

    private static StringBuilder postionToString(int position , StringBuilder result){
        for(int i =0; i < position; i++) {
            result.append("-");
        }
        result.append("\n");

        return result;
    }

    public static void printWinners(List<String> winners) {
        System.out.println(winners.get(0));
        System.out.println(String.join(" , ", winners) + "가 최종 우승했습니다.");
    }


}
