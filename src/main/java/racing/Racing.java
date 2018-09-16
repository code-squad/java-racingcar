package racing;
import java.util.*;

public class Racing {
    static final int RANDOM_STANDARD = 10;
    /* 변수명에는 타입을 넣지 말기 ex) RESULT_STRING */
    private int time;
    private Car[] cars;

    public Racing() {

    }

    public Racing(int time, String[] names) {
        cars = new Car[names.length];
        for(int i = 0; i < cars.length; i++)
            cars[i] = new Car(names[i]);

        this.time = time;
    }

    public void run() {
        for(int i = 0; i < cars.length; i++)
            moveCar(cars[i], time);
    }

    private void moveCar(Car car, int time) {
        for (int i = 0; i < time; i++)
            car.move(getRandom());
    }

    private int getRandom() {
        return new Random().nextInt(RANDOM_STANDARD);
    }

    /* 경주 최종결과 출력 */
    public void printRacingResult() {
        ResultView.printFinalRacingResult(cars);
    }

    /* 우승자등 출력! */
    public void printWinners() {
        ResultView.printFinalWinners(getWinnersList(cars));
    }

    /* 가장 멀리 이동한 자동차 찾기! */
    private Car getFirstWinner(Car[] cars) {
        Arrays.sort(cars);
        return cars[0];
    }

    /* 가장 멀리 이동한 자동차(우승자)들 찾기! */
    private List<String> getWinnersList(Car[] cars) {
        List<String> winners = new ArrayList<>();
        for(Car car : cars)
            if(car.isWinner(getFirstWinner(cars))) winners.add(car.getName());

        return winners;
    }
}