package racingcar.view;

import racingcar.domain.UserInput;

import java.util.Scanner;

public class InputView {
    public UserInput getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String payers = scanner.nextLine();

        System.out.println("시도할 회수는 몇 회 인가요?");
        String roundCount = scanner.nextLine();

        UserInput userInput = new UserInput(payers, roundCount);
        return userInput;
    }
}
