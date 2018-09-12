package racingcar;

import java.util.ArrayList;
import java.util.Scanner;

public class RacingGame {
    private static final String POSITION_CHARACTER = "-";
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
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] nameList = sc.nextLine().split(",");
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
            System.out.print(POSITION_CHARACTER);
        }
        System.out.println();
    }

    public void printWinner() {
        int bestPosition = getMaxPosition();
        String comma = "";
        for (Car car : cars) {
            if (car.getPosition() == bestPosition) {
                System.out.print(comma + car.getName());
                comma = ",";
            }
        }
    }

    private int getMaxPosition() {
        int bestPosition = -1;
        for (Car car : cars) {
            bestPosition = car.comparePosition(bestPosition);
        }
        return bestPosition;
    }
}