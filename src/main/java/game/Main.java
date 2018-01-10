package game;

import game.racingGame.RacingGame;
import game.racingGame.View;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요.");

        String inputNames = scan.nextLine();
        String[] nameOfCars = inputNames.split(",");

        System.out.println("시도할 횟수는 몇번인가요?");
        Integer trialNum = scan.nextInt();

        RacingGame racingGame = new RacingGame(nameOfCars, trialNum);
        racingGame.move();

        System.out.println("실행결과");
        View.getResult(racingGame);
        System.out.println("최종 우승했습니다.");
    }
}
