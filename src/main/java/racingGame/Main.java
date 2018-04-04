package racingGame;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String text = scan.next();
        System.out.println("시도할 회수는 몇 회 인가요?: ");
        int time = scan.nextInt();

        System.out.println("\n실행 결과");
        Game game = new Game();
        game.start(time, text);
    }

}
