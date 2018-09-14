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

    public void moveCar(Car car, int time) {
        for (int i = 0; i < time; i++)
            car.move(getRandom());
    }

    public int getRandom() {
        return new Random().nextInt(RANDOM_STANDARD);
    }

    /* 경주 최종결과 출력 */
    public void printRacingResult() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cars.length; i++)
            sb.append(cars[i].getName()).append(" : ").append(cars[i].getCarDistance() + "\n");

        System.out.println(sb.toString());
    }

    /* 우승자등 출력! */
    public void printWinners() {
        /* 최종 우승자들 출력 */
        StringBuilder sb = new StringBuilder();
        List<String> winnerList = getWinners(cars);
        for(String winner : winnerList)
            sb.append(winner).append(",");

        System.out.println(String.join(",", winnerList) + "가 최종 우승했습니다.");
    }

    /* 가장 멀리 이동한 자동차 찾기! */
    public Car getWinner(Car[] cars) {
        Arrays.sort(cars);
        return cars[0];
    }

    /* 가장 멀리 이동한 자동차(우승자)들 찾기! */
    public List<String> getWinners(Car[] cars) {
        List<String> winners = new ArrayList<>();
        for(Car car : cars)
            if(car.isWinner(getWinner(cars))) winners.add(car.getName());

        return winners;
    }
}