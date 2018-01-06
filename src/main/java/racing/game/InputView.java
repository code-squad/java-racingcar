package racing.game;

import java.util.Scanner;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class InputView {

    private String carInputText;
    private String moveInputText;

    private int numberOfCar;
    private int numberOfMove;
    private Scanner scanner;

    public InputView() {
        this("몇대의 자동차로 몇번의 이동을 할지 입력자동차 대수는 몇 대 인가요?", "시도할 회수는 몇 회 인가요?");
    }

    public InputView(String carInputText, String moveInputText) {
        scanner = new Scanner(System.in);
        this.carInputText = carInputText;
        this.moveInputText = moveInputText;
    }

    /**
     * [출력 예제]
     * 몇대의 자동차로 몇번의 이동을 할지 입력자동차 대수는 몇 대 인가요?
     * 3
     * 시도할 회수는 몇 회 인가요?
     * 5
     */
    public void inputFromUser() {
        inputNumberOfCar();
        inputNumberOfMove();
    }

    private void inputNumberOfCar() {
        System.out.println(carInputText);
        numberOfCar = scanner.nextInt();
    }

    private void inputNumberOfMove() {
        System.out.println(moveInputText);
        numberOfMove = scanner.nextInt();
    }

    public int getNumberOfCar() {
        return numberOfCar;
    }

    public int getNumberOfMove() {
        return numberOfMove;
    }
}
