package game;

import game.racingGame.RacingGame;
import game.racingGame.View;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numberOfCar = scan.nextLine();
        String trialNum = scan.nextLine();

        RacingGame racingGame = new RacingGame(Integer.parseInt(numberOfCar), Integer.parseInt(trialNum));
        racingGame.move();
        View.getResult(racingGame.getCars());
    }
}
