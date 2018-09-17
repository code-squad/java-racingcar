package racingcar;

import java.util.Scanner;

public class InputView {
    static Scanner sc = new Scanner(System.in);

    //자동차 이름 입력 받기
    public static String[] inputName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return sc.nextLine().split(",");

    }

    //시도 회수 입력 받기
    public static int getTryNum() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        //sc.close();           //close는 어느 위치에서 사용해야하는가.. 리턴값 자체를 변수가 아닌 스캐너 메소드로 보낼 경우
        return sc.nextInt();
    }
}
