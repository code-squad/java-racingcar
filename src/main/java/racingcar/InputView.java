package racingcar;

import java.util.Scanner;

public class InputView {

   Scanner s = new Scanner(System.in);

    int time;
    String[] cutName;

    public void input() {           //이름 배정
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String car = s.next();
        carNumverCut(car);
    }

    private void carNumverCut(String car) { //이름 자르기[입력] 사용 ok
        cutName = car.split(",");
    }

    public int moveNumber() {          //동작 횟수
        System.out.println("시도할 회수는 몇회인가요?");
        time = s.nextInt();

        System.out.println();
        return time;
    }
}
