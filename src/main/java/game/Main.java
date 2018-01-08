package game;

import game.racingGame.RacingGame;
import game.racingGame.View;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer numberOfCar = scan.nextInt();
        Integer trialNum = scan.nextInt();

        RacingGame racingGame = new RacingGame(numberOfCar, trialNum);
        racingGame.move();
        View.getResult(racingGame.getCars());
    }
}
