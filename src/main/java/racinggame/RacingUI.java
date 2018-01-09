package racinggame;

import java.util.stream.Collectors;

public class RacingUI {

    private Racing racing;

    public RacingUI(Racing racing) {
        this.racing = racing;
    }

    public void racingResult() {
        racing.getCars().forEach(car-> printResult(car));
    }

    private String getResult(int position) {
        String result = "";
        while (position > 0) {
            result += "-";
            position--;
        }
        return result;
    }

    private void printResult(Car car) {
        System.out.println(car.getName()+" : "+getResult(car.getPosition()));
    }

    public void printWinners() {
        System.out.println(racing.getWinnerCars().stream().map(car -> car.getName()) .collect(Collectors.joining(",")) +"가 최종 우승했습니다.");
    }

}
