package racingcar;

import java.util.ArrayList;
import java.util.Scanner;

public class RacingGame {
    private static final String POSITION_CHARACTER = "-";
    private int time;
    private ArrayList<Car> cars;
    private ArrayList<String> winnerList = new ArrayList<>();

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
        setWinnerList(bestPosition);
        printWinnerList(winnerList);
    }

    private int getMaxPosition() {
        int bestPosition = -1;
        for (Car car : cars) {
            bestPosition = car.comparePosition(bestPosition);
        }
        return bestPosition;
    }

    private void setWinnerList(int bestPosition) {
        for (Car car : cars) {
            checkWinner(car, bestPosition);
        }
    }

    private void checkWinner(Car car, int bestPosition) {
        if (car.isWinner(bestPosition)) {
            winnerList.add(car.getName());
        }
    }

    private void printWinnerList(ArrayList<String> winnerList) {
        System.out.print(winnerList.get(0));
        for (int i = 1; i < winnerList.size(); i++) {
            System.out.print(",");
            System.out.print(winnerList.get(i));
        }
        System.out.println("가 최종우승자입니다");
    }
}