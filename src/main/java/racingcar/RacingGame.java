package racingcar;

import java.util.ArrayList;
import java.util.Scanner;

public class RacingGame {
    private static final String DASH = "-";
    private static final String SPLIT_FACTOR = ",";
    private int time;
    private ArrayList<Car> cars;

    public static void main(String[] args) {
        RacingGame game = new RacingGame();
        game.getInput();
        game.run();
        game.printResult();
        game.printWinner();
    }

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 " + SPLIT_FACTOR + "를 기준으로 구분).");
        String[] nameList = sc.nextLine().split(SPLIT_FACTOR);
        cars = new ArrayList<>();
        for (String name : nameList) {
            cars.add(new Car(name));
        }
        System.out.println("시도할 회수는 몇 회 인가요?");
        time = sc.nextInt();
        sc.close();
    }

    public void run() {
        iterate(time);
    }

    private void iterate(int time) {
        for (int i = 0; i < time; i++) {
            each();
        }
    }

    private void each() {
        for (Car car : cars) {
            car.move();
        }
    }

    public void printResult() {
        for (Car car : cars) {
            System.out.print(car.getName() + " : ");
            printACarPosition(car.getPosition());
        }
    }

    private void printACarPosition(int position) {
        for (int i = 0; i < position; i++) {
            System.out.print(DASH);
        }
        System.out.println();
    }

    public void printWinner() {
        int bestPosition = getMaxPosition();
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.checkWInner(bestPosition));
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb.toString());
    }

    private int getMaxPosition() {
        int bestPosition = -1;
        for (Car car : cars) {
            bestPosition = car.comparePosition(bestPosition);
        }
        return bestPosition;
    }

    private RacingGame before() {
        RacingGame game = new RacingGame();
        game.cars = new ArrayList<Car>();
        game.cars.add(new Car("test1"));
        game.cars.add(new Car("test2"));
        game.cars.add(new Car("test2"));
        return game;
    }

    public boolean zeroTimeTest() {
        RacingGame game = before();
        game.run();
        return game.getMaxPosition() == 1;
    }

    public boolean fiveTimeTest() {
        boolean flag = true;
        for (int i = 0; i < 100 && flag; i++) {
            RacingGame game = before();
            game.time = 5;
            game.run();
            flag = (1 <= game.getMaxPosition()) && (game.getMaxPosition() <= 6);
        }
        return flag;
    }
}