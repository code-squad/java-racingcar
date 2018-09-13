package racingcar;

import java.util.ArrayList;
import java.util.Scanner;

public class RacingGame {
    private static final String DASH = "-";
    private static final String SPLIT_FACTOR = ",";
    private Scanner sc;
    private ArrayList<Car> cars;

    public static void main(String[] args) {
        RacingGame game = new RacingGame(new Scanner(System.in));
        game.initCars(game.getNameInput());
        game.run(game.getTimeInput());
        game.printResult();
        game.printWinner(game.getMaxPosition());
    }

    public RacingGame(Scanner sc){
        this.sc = sc;
    }

    public void initCars(String inputName){
        String[] nameList = inputName.split(SPLIT_FACTOR);
        cars = new ArrayList<>();
        for (String name : nameList) {
            cars.add(new Car(name));
        }
    }

    public String getNameInput() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 " + SPLIT_FACTOR + "를 기준으로 구분).");
        return sc.nextLine();
    }

    public int getTimeInput(){
        System.out.println("시도할 회수는 몇 회 인가요?");
        return sc.nextInt();
    }

    public void run(int time) {
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

    public void printWinner(int bestPosition) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            if(car.isWinner(bestPosition)) {
                sb.append(car.getName());
                sb.append(SPLIT_FACTOR);
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }

    public int getMaxPosition() {
        int bestPosition = -1;
        for (Car car : cars) {
            bestPosition = car.comparePosition(bestPosition);
        }
        return bestPosition;
    }

    public void finalize(){
        sc.close();
    }
}