package racingcar;

import java.util.ArrayList;
import java.util.Scanner;

public class RacingGame {
    private static final String POSITION_CHARACTER = "-";
    private int time;
    private Car[] cars;

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
        cars = new Car[nameList.length];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(nameList[i]);
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
        for (int carIndex = 0; carIndex < cars.length; carIndex++) {
            cars[carIndex].move();
        }
    }


    public void printResult() {
        for (int carIndex = 0; carIndex < cars.length; carIndex++) {
            System.out.print(cars[carIndex].getName() + " : ");
            printACarPosition(carIndex);
        }
    }

    private void printACarPosition(int carIndex) {
        int position = cars[carIndex].getPosition();
        for (int l = 0; l < position; l++) {
            System.out.print(POSITION_CHARACTER);
        }
        System.out.println();
    }

    public void printWinner() {
        int bestPosition = getMaxPosition();
        ArrayList<String> winnerList = getWinnerList(bestPosition);
        printWinnerList(winnerList);
    }

    private int getMaxPosition() {
        int bestPosition = -1;
        for (int i = 0; i < cars.length; i++) {
            bestPosition = Math.max(bestPosition, cars[i].getPosition());
        }
        return bestPosition;
    }

    private ArrayList<String> getWinnerList(int bestPosition) {
        ArrayList<String> winnerList = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            checkWinner(cars[i], bestPosition, winnerList);
        }
        return winnerList;
    }

    private void checkWinner(Car car, int bestPosition, ArrayList<String> winnerList) {
        if (bestPosition == car.getPosition()) {
            winnerList.add(car.getName());
        }
    }

    private void printWinnerList(ArrayList<String> winnerList) {
        System.out.print(winnerList.get(0));
        for (int i = 1; i < winnerList.size(); i++) {
            System.out.print(",");
            System.out.print(winnerList.get(i));
        }
        System.out.println();
    }
}