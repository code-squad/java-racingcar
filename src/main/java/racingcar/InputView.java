package racingcar;

import java.util.Scanner;

public class InputView {
    public UserInput getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        String carCount = scanner.nextLine();

        System.out.println("시도할 회수는 몇 회 인가요?");
        String roundCount = scanner.nextLine();

        UserInput userInput = new UserInput(carCount, roundCount);
        return userInput;
    }
}
