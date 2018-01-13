package com.me.racingcar;

import com.me.racingcar.game.racing.Car;
import com.me.racingcar.game.racing.RacingGame;

import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        String carNames = scanner.nextLine();

        System.out.println("시도할 회수는 몇 회 인가요?");
        int termCount = scanner.nextInt();

        RacingGame game = new RacingGame(carNames, termCount);
        List<Car> cars = game.start();
        game.viewResult();

        List<Car> winner = game.getWinner();

    }

}
