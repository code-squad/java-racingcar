import java.util.Scanner;

public class RacingGameMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] names = scan.nextLine().split(",");
        System.out.println("시도는 몇 회인가요?");
        int time = scan.nextInt();

        RacingGame racingGame = new RacingGame(names, time);
        racingGame.start();
        racingGame.printResult();
        racingGame.printWinners();
    }

}
