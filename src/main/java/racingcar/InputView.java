package racingcar;

import java.util.Scanner;

public class InputView {

    Scanner s = new Scanner(System.in);

    public String[] userName(){
        String[] nameArr;
        String inputName;

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)를 기준으로 구분)");
        inputName = s.nextLine();

        nameArr = inputName.split(",");
        return nameArr;
    }


    public int time() {
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int count = s.nextInt();
        return count;
    }
}
