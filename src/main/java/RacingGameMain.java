import java.util.Scanner;

public class RacingGameMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("자동차는 몇 대인가요?");
        int carCount = scan.nextInt();
        System.out.println("시도는 몇 회인가요?");
        int time = scan.nextInt();

        RacingGame racingGame = new RacingGame(carCount, time);
        racingGame.start();
        racingGame.printResult();
    }

}
